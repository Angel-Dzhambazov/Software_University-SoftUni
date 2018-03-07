package hw01_JavaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P12_ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] line =  reader.readLine().toCharArray();
        for (int i = line.length-1; i >= 0; i--) {
            System.out.print(line[i]);
        }
    }
}
