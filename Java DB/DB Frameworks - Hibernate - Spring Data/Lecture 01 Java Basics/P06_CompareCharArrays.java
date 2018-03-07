package hw01_JavaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P06_CompareCharArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = reader.readLine().split(" ");
        String[] line2 = reader.readLine().split(" ");
        String a = String.join("", line1);
        String b = String.join("", line2);
        int compare = a.compareTo(b);
        if (compare<=0){
            System.out.println(a);
            System.out.println(b);
        } else {
            System.out.println(b);
            System.out.println(a);
        }
    }
}
