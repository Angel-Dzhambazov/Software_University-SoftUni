package march13_Softuni.p07_Mankind;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fluch on 3/13/2018.
 */
abstract class Human {

    private static final String TOO_SHORT_FIRST_NAME = "Expected length at least 4 symbols!Argument: firstName";
    private static final String INVALID_START_LETTER_FIRST_NAME = "Expected upper case letter!Argument: firstName";
    private static final String TOO_SHORT_LAST_NAME = "Expected length at least 3 symbols!Argument: lastName";
    private static final String INVALID_START_LETTER_LAST_NAME = "Expected upper case letter!Argument: lastName";

    private String firstName;
    private String lastName;

    Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    private void setFirstName(String firstName) {
        if (firstName == null || firstName.length() < 4) {
            throw new IllegalArgumentException(TOO_SHORT_FIRST_NAME);
        }
        if (!capitalLetterFirstName(firstName)) {
            throw new IllegalArgumentException(INVALID_START_LETTER_FIRST_NAME);
        } else {
            this.firstName = firstName;
        }

    }

    private void setLastName(String lastName) {
        if (firstName == null || lastName.length() < 3) {
            throw new IllegalArgumentException(TOO_SHORT_LAST_NAME);
        }
        if (!capitalLetterFirstName(lastName)) {
            throw new IllegalArgumentException(INVALID_START_LETTER_LAST_NAME);
        } else {
            this.lastName = lastName;
        }
    }

    private boolean capitalLetterFirstName(String name) {
        Pattern p = Pattern.compile("^[A-Z]+");
        Matcher m = p.matcher(name);
        return m.find();
    }
}
