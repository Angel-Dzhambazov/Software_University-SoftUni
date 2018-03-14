package hw04_OOPPrinciples.p04_Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by fluch on 3/13/2018.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] phonesNumbers = reader.readLine().split("\\s+");
        String[] webSites = reader.readLine().split("\\s+");

        Smartphone phone = new Smartphone(phonesNumbers,webSites);
        phone.call();
        phone.brows();
    }
}
