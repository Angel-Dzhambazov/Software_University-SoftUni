package hw04_OOPPrinciples.p09_Animals;

public class Dog extends Animal {

    Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected String produceSound() {
        return ("BauBau");
    }
}
