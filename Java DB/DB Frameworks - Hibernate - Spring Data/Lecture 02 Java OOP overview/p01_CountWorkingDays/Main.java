package hw02_OOP_Overview.p01_CountWorkingDays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        Integer counter = 0;
        Set<String> HOLIDAYS = new HashSet<>(Arrays.asList("1-0", "3-2", "1-4", "6-4", "24-4", "6-8", "22-8", "1-9", "24-11", "25-11", "26-11"));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = reader.readLine();
        String line2 = reader.readLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date firstDate = sdf.parse(line1);
        Date secondDate = sdf.parse(line2);

        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(firstDate);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(secondDate);


        while (!cal1.after(cal2)) {
            if (!((cal1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) || (cal1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) && !HOLIDAYS.contains(String.format("%s-%s", cal1.get(Calendar.DAY_OF_MONTH), cal1.get(Calendar.MONTH)))) {
                counter++;
            }
            cal1.add(Calendar.DATE, 1);
        }


        System.out.println(counter);
    }
}
