package hw04_OOPPrinciples.p09_Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String INVALID_INPUT = "Invalid input!";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = reader.readLine();
        while (true) {
            if ("Beast!".equalsIgnoreCase(command) || command == null) {
                break;
            }
            try {
                String[] tokens = reader.readLine().split("\\s+");
                Animal animal = smallFactory(command, tokens);
                System.out.println(command);
                System.out.println(animal);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());

            } finally {
                command = reader.readLine();
            }
        }
    }

    private static Animal smallFactory(String animal, String[] tokens) {
        switch (animal) {
            case "Dog":
                return new Dog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            case "Cat":
                return new Cat(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            case "Frog":
                return new Frog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            case "Kitten":
                return new Kitten(tokens[0], Integer.parseInt(tokens[1]), "Female");
            case "Tomcat":
                return new Tomcat(tokens[0], Integer.parseInt(tokens[1]), "Male");
            default:
                throw new IllegalArgumentException(INVALID_INPUT);
//                return new Animal(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
        }
    }
}
