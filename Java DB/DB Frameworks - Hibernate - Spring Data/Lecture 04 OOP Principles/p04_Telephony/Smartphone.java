package march13_Softuni.p04_Telephony;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fluch on 3/13/2018.
 */
class Smartphone implements Browsing, Calling {
    private String[] phoneNumbers;
    private String[] webSites;

    public Smartphone() {
    }

    public Smartphone(String[] phoneNumbers, String[] webSites) {
        this.phoneNumbers = phoneNumbers;
        this.webSites = webSites;
    }

    @Override
    public void brows() {
        for (String webSite : webSites) {
            if (isWebsiteCorrect(webSite)) {
                System.out.println("Invalid URL!");
            } else {
                System.out.println(String.format("Browsing: %s!", webSite));
            }
        }
    }

    @Override
    public void call() {
        for (String phoneNumber : phoneNumbers) {
            if (isPhoneNumberCorrect(phoneNumber)) {
                System.out.println(String.format("Calling... %s", phoneNumber));
            } else {
                System.out.println("Invalid number!");
            }
        }
    }

    private boolean isWebsiteCorrect(String website) {
        Pattern p = Pattern.compile("(.*[0-9]+)");
        Matcher m = p.matcher(website);
        return m.find();
    }

    private boolean isPhoneNumberCorrect(String number) {

        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(number);
        return m.find();
    }
}
