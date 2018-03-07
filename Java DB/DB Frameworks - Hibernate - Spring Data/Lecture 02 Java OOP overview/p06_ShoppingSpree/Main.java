package hw02_OOP_Overview.p06_ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> personMap = new LinkedHashMap<>();
        Map<String, Product> productMap = new HashMap<>();

        try {
            String[] tokens = reader.readLine().split(";");
            for (String token : tokens) {
                try {
                    String[] elements = token.split("=");
                    personMap.putIfAbsent(elements[0], new Person(elements[0], Integer.parseInt(elements[1])));
                } catch (NullPointerException ignored) {
                }
            }
            String[] tokens2 = reader.readLine().split(";");
            for (String token : tokens2) {
                try {
                    String[] elements = token.split("=");
                    productMap.putIfAbsent(elements[0], new Product(elements[0], Integer.parseInt(elements[1])));
                } catch (NullPointerException ignored) {
                }
            }

            while (true) {
                String line = reader.readLine();
                if ("end".equalsIgnoreCase(line)) {
                    break;
                }
                String[] elements = line.split(" ");

                Person person = personMap.get(elements[0]);
                Product product = productMap.get(elements[1]);
                System.out.println(person.buyProduct(product));
            }

            for (Person person : personMap.values()) {
                System.out.println(person);
            }
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }

    }
}
