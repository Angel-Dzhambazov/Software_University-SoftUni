package hw04_OOPPrinciples.p07_Mankind;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fluch on 3/13/2018.
 */
class Student extends Human {


    private static final String INVALID_FACULTY_NUMBER = "Invalid faculty number!";

    private String facultyNumber;

    Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);

    }

    private void setFacultyNumber(String facultyNumber) {
        if (onlyDigits(facultyNumber) && facultyNumber.length() > 4 && facultyNumber.length() < 11) {
            this.facultyNumber = facultyNumber;
        } else {
            throw new IllegalArgumentException(INVALID_FACULTY_NUMBER);
        }
    }

    private boolean onlyDigits(String name) {
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(name);
        return m.find();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("First Name: %s", super.getFirstName())).append(System.lineSeparator());
        sb.append(String.format("First Name: %s", super.getLastName())).append(System.lineSeparator());
        sb.append(String.format("Faculty number: %s", this.facultyNumber)).append(System.lineSeparator());
        return sb.toString();
    }
}
