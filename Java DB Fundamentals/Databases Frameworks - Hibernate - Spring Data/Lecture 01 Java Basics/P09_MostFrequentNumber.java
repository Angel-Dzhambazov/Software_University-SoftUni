package hw01_JavaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class P09_MostFrequentNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] input = Stream.of(reader.readLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);

        int tempCount = 1;
        int tempDigit = input[0];
        int finalDigit = input[0];
        int finalCount = 1;

        Set<Integer> checkedDigits = new HashSet<>();


        for (int i = 1; i < input.length; i++) {
            if (!checkedDigits.contains(tempDigit)) {
                for (int j = 1; j < input.length; j++) {
                    if (input[j] == tempDigit) {
                        tempCount++;
                    }
                }
            }
            if (tempCount > finalCount) {
                finalDigit = tempDigit;
                finalCount = tempCount;
            }
            checkedDigits.add(tempDigit);
            tempDigit = input[i];
            tempCount = 0;
        }

        System.out.println(finalDigit);
        //System.out.printf("The number %d is the most frequent (occurs %d times)", finalDigit, finalCount);
    }
}
