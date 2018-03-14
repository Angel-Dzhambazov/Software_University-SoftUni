package hw04_OOPPrinciples.p09_Animals;

public class Kitten extends Cat{
    Kitten(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected String produceSound() {
        return ("Miau");
    }


}
