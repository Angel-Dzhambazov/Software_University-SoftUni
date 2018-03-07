package hw02_OOP_Overview.p02_AdvertisementMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int digit = Integer.parseInt(reader.readLine());

        String[] phrases = new String[]{"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = new String[]{"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",                   "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author = new String[] {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = new String[] {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        while (digit>0){
            System.out.println(String.format("%s %s %s – %s",
                    phrases[calculateRandom(phrases.length)],
                    events[calculateRandom(events.length)],
                    author[calculateRandom(author.length)],
                    cities[calculateRandom(cities.length)]));
            digit--;
        }


    }
    private static int calculateRandom(Integer i){
        Random rand = new Random();
        return rand.nextInt(i);
    }
}
