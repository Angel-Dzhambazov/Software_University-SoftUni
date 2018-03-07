package hw02_OOP_Overview.p07_AverageGrades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    private static Map<String, List<Double>> students;

    public static void main(String[] args) throws IOException {

        students = new TreeMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(reader.readLine());
        for (int i = 0; i < lines; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            Student student = new Student(tokens[0]);
            for (int j = 1; j < tokens.length; j++) {
                student.addGrade(Double.valueOf(tokens[j]));
            }
            if (student.getAverageGrades() >= 5.0) {
                fillStudents(student);
            }
        }

        for (Map.Entry<String, List<Double>> tempStudent : students.entrySet()) {
            tempStudent.getValue().sort((d1,d2) -> Double.compare(d2,d1));
            String nameOfStudent = tempStudent.getKey();
            for (int i = 0; i < tempStudent.getValue().size(); i++) {
                System.out.println(String.format("%s -> %.2f", nameOfStudent, tempStudent.getValue().get(i) ));
            }

        }

    }

    private static void fillStudents(Student student) {
        students.putIfAbsent(student.getName(), new ArrayList<>());
        students.get(student.getName()).add(student.getAverageGrades());
    }
}
