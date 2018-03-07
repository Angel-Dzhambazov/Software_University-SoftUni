package hw01_JavaBasic;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class P01_Variable_in_HexademicalFormat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String hexacemical = reader.readLine();

        System.out.println(Integer.parseInt(hexacemical, 16 ));
    }
}
