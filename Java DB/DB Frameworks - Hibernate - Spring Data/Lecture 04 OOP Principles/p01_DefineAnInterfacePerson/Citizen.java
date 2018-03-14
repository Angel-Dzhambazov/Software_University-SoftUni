package hw04_OOPPrinciples.p01_DefineAnInterfacePerson;

/**
 * Created by fluch on 3/13/2018.
 */
class Citizen implements Person {
    private String name;
    private int age;

    public Citizen() {
    }

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
