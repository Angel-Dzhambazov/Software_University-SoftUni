package hw04_OOPPrinciples.p07_Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String[] tokens = reader.readLine().split("\\s+");
            Human human1 = createHuman(tokens);
            System.out.println(human1.toString());
            tokens = reader.readLine().split("\\s+");
            Human human2 = new Worker(tokens[0], tokens[1], Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));

            System.out.println(human2.toString());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }

    private static Human createHuman(String[] tokens) {
        if (tokens.length == 3) {
            return new Student(tokens[0], tokens[1], tokens[2]);
        } else {
            return new Worker(tokens[0], tokens[1], Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
        }
    }
}
