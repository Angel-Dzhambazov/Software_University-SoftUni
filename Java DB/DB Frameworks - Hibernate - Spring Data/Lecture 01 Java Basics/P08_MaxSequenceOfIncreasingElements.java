package hw01_JavaBasic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;


public class P08_MaxSequenceOfIncreasingElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] input = Stream.of(reader.readLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);


        int finalLength = 1;
        int finalIndex = 1;
        int finalElement = input[0];
        int tempLenght = 1;
        int tempElement = input[0];
        for (int i = 1; i < input.length; i++) {
            if (tempElement + 1 <= (input[i])) {
                tempLenght++;
                tempElement = input[i];
                if (i == input.length - 1) {
                    if (tempLenght > finalLength) {
                        finalLength = tempLenght;
                        finalIndex = i;
                    }
                }
            } else {
                if (tempLenght > finalLength) {
                    finalLength = tempLenght;
                    finalIndex = i-1;
                }
                tempElement = input[i];
                tempLenght = 1;
            }
        }
        int[] printThis = new int[finalLength];
        for (int i = finalLength-1; i >= 0; i--) {
            printThis[i] = input[finalIndex--];
        }
        String[] result = Arrays.stream(printThis).mapToObj(String::valueOf).toArray(String[]::new);
        System.out.println(String.join(" ",result));
    }
}
