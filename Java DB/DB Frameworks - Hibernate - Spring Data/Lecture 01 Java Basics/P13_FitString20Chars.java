package hw01_JavaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P13_FitString20Chars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20 - line.length(); i++) {
            sb.append("*");
        }

        if (line.length() >= 20) {
            System.out.println(line.substring(0, 20));
        } else {
            System.out.println(line + sb.toString());
        }
    }
}
