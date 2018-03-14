package hw04_OOPPrinciples.p08_Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = reader.readLine().split("\\s+");
        Vehicle vehicle1 = smallFactory(tokens);

        tokens = reader.readLine().split("\\s+");
        Vehicle vehicle2 = smallFactory(tokens);

        int commandsCount = Integer.parseInt(reader.readLine());

        while (commandsCount-- > 0) {
            String[] commandArgs = reader.readLine().split("\\s+");
            if (commandArgs.length == 3) {
                switch (commandArgs[0]) {
                    case "Drive":
                        if ("car".equalsIgnoreCase(commandArgs[1])) {
                            vehicle1.drive(Double.parseDouble(commandArgs[2]));
                        } else {
                            vehicle2.drive(Double.parseDouble(commandArgs[2]));
                        }
                        break;
                    case "Refuel":
                        if ("car".equalsIgnoreCase(commandArgs[1])) {
                            vehicle1.refuel(Double.parseDouble(commandArgs[2]));
                        } else {
                            vehicle2.refuel(Double.parseDouble(commandArgs[2]));
                        }
                        break;
                }
            }
        }

        System.out.println(vehicle1);
        System.out.println(vehicle2);


    }


    private static Vehicle smallFactory(String[] tokens) {
        if ("car".equalsIgnoreCase(tokens[0])) {
            return new Car(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
        } else {
            return new Truck(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
        }
    }
}
