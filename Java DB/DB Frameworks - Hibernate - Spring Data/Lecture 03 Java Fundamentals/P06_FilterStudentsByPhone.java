package hw03_JavaFundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P06_FilterStudentsByPhone {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] line = reader.readLine().split("\\s+");

        List<StudentEmail> studentList = new ArrayList<>();
        while (!"end".equalsIgnoreCase(line[0])) {
            String fName = line[0];
            String lName = line[1];
            String email = line[2];
            StudentEmail student = new StudentEmail(fName, lName, email);
            studentList.add(student);
            line = reader.readLine().split("\\s+");
        }

        studentList.stream().filter(s -> s.getPhoneNumber().startsWith("02") || s.getPhoneNumber().startsWith("+3592"))
                .forEach(System.out::println);
    }
}

class StudentEmail {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    public StudentEmail() {
    }

    StudentEmail(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = email;
    }

    String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
