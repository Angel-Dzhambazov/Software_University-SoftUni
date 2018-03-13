package march13_Softuni.p06_BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by fluch on 3/13/2018.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<String> birthDates = new HashSet<>();
        String line = reader.readLine();
        while (true) {
            if ("end".equalsIgnoreCase(line)) {
                break;
            }
            String[] tokens = line.split("\\s+");
            switch (tokens[0]){
                case "Citizen":
                    birthDates.add(tokens[4]);
                    break;
                case "Robot":
                    break;
                case "Pet":
                    birthDates.add(tokens[2]);
                    break;
                default:break;
            }
            line = reader.readLine();
        }
        String year = reader.readLine();

        for (String birthDate : birthDates) {
            if (birthDate.endsWith(year)){
                System.out.println(birthDate);

            }
        }

    }
}
