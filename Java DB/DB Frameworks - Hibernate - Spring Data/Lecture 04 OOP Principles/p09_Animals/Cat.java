package hw04_OOPPrinciples.p09_Animals;

class Cat  extends  Animal{
    Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected String produceSound() {
        return ("MiauMiau");
    }
}
