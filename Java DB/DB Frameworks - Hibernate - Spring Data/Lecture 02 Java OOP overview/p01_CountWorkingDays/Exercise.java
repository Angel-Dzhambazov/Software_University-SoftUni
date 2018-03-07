package hw02_OOP_Overview.p01_CountWorkingDays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;

// Date and Calendar API in Java | Team MAST
// https://www.youtube.com/watch?v=dovumgRZF_E

// Date Operations in Java | Team MAST
// https://www.youtube.com/watch?v=TTQPgfa38K8
public class Exercise {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String line1 = reader.readLine();
//        String line2 = reader.readLine();

        String line1 = "30-04-2016";
        String line2 = "14-04-2016";

        String[] holidays = new String[] {"01-01", "03-03", "01-05", "06-05", "24-05", "06-09", "22-09", "01-10", "24-12", "25-12", "26-12"};
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
      //  Date date1 = sdf.parse(line1);
        Date date1 = new Date();
        try {
            date1 = sdf.parse(line1);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(String.format("String to Date : %s",date1));

        String dateString_dd_mm_yyyy = sdf.format(date1);
        System.out.println(String.format("Date to String : %s", dateString_dd_mm_yyyy));


        //        Може автоматично да хвърля грешка (както при рийдъра), а може и сами да си я "хванем":


        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy EEE");
        String dateStringDD_MM = sdf2.format(date1);
        System.out.println(String.format("Date to String : %s", dateStringDD_MM));

        System.out.println(date1.getDay());

        List<String> holidaysL = new ArrayList<>(Arrays.asList("01-01", "03-03", "01-05", "06-05", "24-05", "06-09", "22-09", "01-10", "24-12", "25-12", "26-12"));
        if (holidaysL.contains(dateStringDD_MM)){
            System.out.println("It is a holiday! " + dateStringDD_MM);
        }

        //Date to Calendar

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date1);

        System.out.println("year is:");
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println("month is:");
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println("date is:");
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println("day of month is:");
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("day of week is:");
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        calendar.add(Calendar.DATE, 1);
        System.out.println("We have just added one day to the calendar");
        System.out.println("year is:");
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println("month is:");
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println("date is:");
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println("day of month is:");
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("day of week is:");
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));




     }

    private static void method(String a) {

    }
}
