package hw04_OOPPrinciples.p06_BirthdayCelebrations;

/**
 * Created by fluch on 3/13/2018.
 */
 class Robot {
    private String model;
    private String id;

    public Robot() {
    }

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
