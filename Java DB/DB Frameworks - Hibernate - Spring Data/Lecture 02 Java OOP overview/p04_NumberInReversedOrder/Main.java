package hw02_OOP_Overview.p04_NumberInReversedOrder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(line);
        System.out.println(sb.reverse().toString());
    }
}
