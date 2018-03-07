package hw01_JavaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02_Boolean_Variable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        System.out.println(input.equals("True") ? "Yes" : "No");

    }
}
