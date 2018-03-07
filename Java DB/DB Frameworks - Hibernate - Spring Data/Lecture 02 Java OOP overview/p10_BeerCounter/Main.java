package hw02_OOP_Overview.p10_BeerCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            BeerCounter beerCounter = new BeerCounter();
            while (true) {
                if ("end".equalsIgnoreCase(line)) {
                    break;
                }
                int[] beers = Arrays.stream(line.split("\\s+")).mapToInt(Integer::parseInt).toArray();
                BeerCounter.buyBeer(beers[0]);
                BeerCounter.drinkBeer(beers[1]);
                line = reader.readLine();
            }
        } catch (NullPointerException ignored) {
        } finally {
            System.out.println(String.format("%d %d", BeerCounter.beerInStock, BeerCounter.beersDrankCount));
        }
    }
}


