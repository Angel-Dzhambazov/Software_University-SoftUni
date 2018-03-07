package hw01_JavaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10_IndexOfLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = reader.readLine().toCharArray();
        for (char c : input) {
            int a = ((int) c) - 97;
            System.out.println(String.format("%s -> %d", c, a));
        }
    }
}
