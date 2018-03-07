package hw01_JavaBasic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04_VowelOrDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String c = reader.readLine().toUpperCase();
        String[] output = new String[1];
        output[0] = "other";
        Pattern digit = Pattern.compile("[0-9]");
        Pattern vowel = Pattern.compile("[AEIOU]");
        Matcher matcherDigit = digit.matcher(c);
        Matcher matcherVowel = vowel.matcher(c);
        while (matcherDigit.find()) {
            output[0] = "digit";

            for (int i = 1; i <= matcherDigit.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcherDigit.group(i));
            }
        }

        while (matcherVowel.find()) {
            output[0] = "vowel";
            for (int i = 1; i <= matcherVowel.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcherVowel.group(i));
            }
        }
        System.out.println(output[0]);
    }
}
