package hw04_OOPPrinciples.p03_Ferrari;

/**
 * Created by fluch on 3/13/2018.
 */
class Ferrari implements Car {
    private String model = "488-Spider";
    private String driver;

    public Ferrari() {
    }

    public Ferrari( String driver) {
        this.driver = driver;
    }

    @Override
    public String pushThePedal() {

        return "Zadu6avam sA!";
    }

    @Override
    public String pressBrakes() {
        return "Brakes!";
    }

    @Override
    public String toString() {

        return (String.format("%s/%s/%s/%s", this.model, this.pressBrakes(), this.pushThePedal(), this.driver));
    }
}
