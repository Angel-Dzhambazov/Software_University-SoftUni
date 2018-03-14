package hw04_OOPPrinciples.p03_Ferrari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;

/**
 * Created by fluch on 3/13/2018.
 */
public class Main {
    public static void main(String[] args) throws IllegalClassFormatException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String driverName = reader.readLine();

        Ferrari ferrari = new Ferrari(driverName);

        System.out.println(ferrari.toString());



        String ferrariName = Ferrari.class.getSimpleName();
        String carInterface = Car.class.getSimpleName();
        boolean isCreated = Car.class.isInterface();
        if (!isCreated) {
            throw new IllegalClassFormatException("No interface created!");
        }

    }
}
