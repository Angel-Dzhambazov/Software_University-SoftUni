package march13_Softuni.p05_BorderControl;

/**
 * Created by fluch on 3/13/2018.
 */
 class Citizen {
    private String name;
    private int age;
    private String id;

    public Citizen() {
    }

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
