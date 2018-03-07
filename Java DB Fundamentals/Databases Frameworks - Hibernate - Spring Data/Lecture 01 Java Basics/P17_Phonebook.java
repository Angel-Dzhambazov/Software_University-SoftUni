package hw01_JavaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P17_Phonebook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        Map<String, String> phonebook = new HashMap<>();

        while (true){
            if ("end".equalsIgnoreCase(line)){
                break;
            }
            String[] tokens = line.split(" ");
            if ("a".equalsIgnoreCase(tokens[0])){
                phonebook.put(tokens[1],tokens[2]);
            }else {
                if (phonebook.containsKey(tokens[1])){
                    System.out.println(String.format("%s -> %s",tokens[1],phonebook.get(tokens[1])));
                } else {
                    System.out.println(String.format("Contact %s does not exist.",tokens[1]));
                }
            }


            line=reader.readLine();
        }
    }
}
