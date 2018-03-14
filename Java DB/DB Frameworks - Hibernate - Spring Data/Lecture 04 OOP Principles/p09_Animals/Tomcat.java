package hw04_OOPPrinciples.p09_Animals;

public class Tomcat extends Cat {
    Tomcat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected String produceSound() {
        return ("Give me one million b***h");
    }


}
