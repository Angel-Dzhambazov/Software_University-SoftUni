package hw02_OOP_Overview.p09_Students;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int counter = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        while (true){
            if ("end".equalsIgnoreCase(line)){
                break;
            }
            Student student = new Student(line);
            counter++;
            line = reader.readLine();
        }

        System.out.println(counter);
    }

}
