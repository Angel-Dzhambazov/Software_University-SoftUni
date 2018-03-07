package hw01_JavaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class P11_EqualSums {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] input = Stream.of(reader.readLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);
        int leftSum = 0;
        int rightSum = 0;
        boolean didWeFindIndex = false;
        for (int i = 0; i < input.length; i++) {
            leftSum = calculcateSum(0, i - 1, input);
            rightSum = calculcateSum(i + 1, input.length - 1, input);
            if (leftSum==rightSum){
                System.out.println(i);
                didWeFindIndex = true;
            }
        }
        if (!didWeFindIndex){
            System.out.println("no");
        }
    }

    private static int calculcateSum(int start, int end, Integer[] input) {
        int sum = 0;
        for (int j = start; j <= end; j++) {
            try {
                sum += input[j];
            } catch (IndexOutOfBoundsException ignored) {
            }
        }
        return sum;
    }
}
