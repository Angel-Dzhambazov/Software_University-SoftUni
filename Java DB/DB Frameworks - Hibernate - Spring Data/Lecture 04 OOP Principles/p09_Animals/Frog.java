package hw04_OOPPrinciples.p09_Animals;

public class Frog extends  Animal {
    Frog(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    protected String produceSound() {
        return ("Frogggg");
    }
}