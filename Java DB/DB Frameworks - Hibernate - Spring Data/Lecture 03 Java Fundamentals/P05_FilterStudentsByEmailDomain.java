package hw03_JavaFundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P05_FilterStudentsByEmailDomain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split("\\s+");

        List<Student> studentList = new ArrayList<>();
        while (!"end".equalsIgnoreCase(line[0])) {
            String fName = line[0];
            String lName = line[1];
            String email = line[2];
            Student student = new Student(fName, lName, email);
            studentList.add(student);
            line = reader.readLine().split("\\s+");
        }

        studentList.stream().filter(s -> s.getEmail().endsWith("@gmail.com")).forEach(System.out::println);
    }
}

class Student {

    private String firstName;
    private String lastName;
    private String email;

    public Student() {
    }

    Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
