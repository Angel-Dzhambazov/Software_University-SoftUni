package hw04_OOPPrinciples.p02_MultipleImplementation;

/**
 * Created by fluch on 3/13/2018.
 */
class Citizen implements Person, Birthable,Identifiable {
    private String name;
    private int age;
    private String id;
    private String birthdate;


    public Citizen() {
    }

    public Citizen(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getBirthdate() {
        return birthdate;
    }
}
