package hw02_OOP_Overview.p05_IntersectionOfCircles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] circle1 = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] circle2 = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        double r = circle1[2] + circle2[2];
        //System.out.println("r1 + r1 = " + r);

        double distance = calculateDistance(circle1, circle2);
        //System.out.println("distance between two centers = " + distance);
        System.out.println(printMathod(distance, r));

    }

    private static String printMathod(double distance, double r) {
        double result = distance - r;
        //System.out.println("result = " + result);
        if (result <= 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    private static double calculateDistance(int[] circle1, int[] circle2) {
        double a = Math.abs(circle2[0]) - Math.abs(circle1[0]);
        double b = Math.abs(circle2[1]) - Math.abs(circle1[1]);
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
