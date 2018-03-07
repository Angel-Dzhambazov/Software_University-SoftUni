package hw01_JavaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P03_ReverseCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] input = new String[3];
        for (int i = 0; i < 3; i++) {
            input[i]= reader.readLine();
        }
        for (int i = 2; i >= 0; i--) {
            System.out.print(input[i]);
        }
    }
}
