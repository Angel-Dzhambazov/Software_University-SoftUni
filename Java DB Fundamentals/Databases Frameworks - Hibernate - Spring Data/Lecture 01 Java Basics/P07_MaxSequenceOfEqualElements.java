package hw01_JavaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class P07_MaxSequenceOfEqualElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        int finalLength = 1;
        String finalElement = input[0];
        int tempLenght = 1;
        String tempElement = input[0];
        for (int i = 1; i < input.length; i++) {
            if (tempElement.equals(input[i])) {
                tempLenght++;
                if (i == input.length-1){
                    if (tempLenght > finalLength) {
                        finalLength = tempLenght;
                        finalElement = tempElement;
                    }
                }
            } else {
                if (tempLenght > finalLength) {
                    finalLength = tempLenght;
                    finalElement = tempElement;
                }
                tempElement = input[i];
                tempLenght = 1;
            }
        }
        System.out.println(String.join(" ", Collections.nCopies(finalLength, finalElement)));
    }
}
