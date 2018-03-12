package hw03_JavaFundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P07_ExcellentStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split("\\s+");

        List<Students3Grades> studentList = new ArrayList<>();
        while (!"end".equalsIgnoreCase(line[0])) {
            String fName = line[0];
            String lName = line[1];
            int[] grades = Arrays.stream(line).skip(2L).mapToInt(Integer::parseInt).toArray();
            Students3Grades student = new Students3Grades(fName, lName, grades);
            studentList.add(student);
            line = reader.readLine().split("\\s+");
        }
        studentList.stream().filter(s -> Arrays.stream(s.getGrades()).anyMatch(g ->g == 6)).forEach(System.out::println);


    }
}

class StudentsGrades {

    private String firstName;
    private String lastName;
    private int[] grades;

    public StudentsGrades() {
    }

    StudentsGrades(String firstName, String lastName, int[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    int[] getGrades() {
        return this.grades;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}