package march13_Softuni.p06_BirthdayCelebrations;

/**
 * Created by fluch on 3/13/2018.
 */
 class Citizen {
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

    public String getId() {
        return id;
    }
}
