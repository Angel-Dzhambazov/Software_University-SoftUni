package hw01_JavaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14_CensorEmailAddress {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        String text = reader.readLine();
        int a = line.indexOf('@');
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            sb.append("*");
        }
        sb.append(line.substring(a,line.length()));
        System.out.println(text.replace(line,sb.toString()));
    }
}
