package hw01_JavaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P05_IntegerToHexAndBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer input = Integer.parseInt(reader.readLine());
        System.out.println(Integer.toHexString(input).toUpperCase());
        printBinary(input);



    }
    private static void printBinary(Integer input) {
        StringBuilder sb = new StringBuilder();
        while (input > 0) {
            if (input % 2 == 1) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            input/=2;
        }
        sb.reverse();
        System.out.println(sb.toString());
    }
}
