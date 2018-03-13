package march13_Softuni.p05_BorderControl;

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

        Set<Citizen> citizens = new LinkedHashSet<>();
        Set<Robot> robots = new LinkedHashSet<>();
        Set<String> ids = new LinkedHashSet<>();
        String line = reader.readLine();
        while (true) {
            if ("end".equalsIgnoreCase(line)) {
                break;
            }
            String[] tokens = line.split("\\s+");
            switch (tokens.length){
                case 2:
                    robots.add(new Robot(tokens[0],tokens[1]));
                    ids.add(tokens[1]);
                    break;
                case 3:
                    citizens.add(new Citizen(tokens[0], Integer.parseInt(tokens[1]),tokens[2]));
                    ids.add(tokens[2]);
                    break;
                default:break;
            }
            line = reader.readLine();
        }
        String fakeId = reader.readLine();
        for (String id : ids) {
            if (id.endsWith(fakeId)){
                System.out.println(id);
            }
        }
//        for (Citizen citizen : citizens) {
//            if (citizen.getId().endsWith(fakeId)){
//                System.out.println(citizen.getId());
//            }
//        }
//        for (Robot robot : robots) {
//            if (robot.getId().endsWith(fakeId)){
//                System.out.println(robot.getId());
//            }
//        }
    }
}
