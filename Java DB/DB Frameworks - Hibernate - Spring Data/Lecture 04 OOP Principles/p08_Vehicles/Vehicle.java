package march13_Softuni.p08_Vehicles;

/**
 * Created by fluch on 3/13/2018.
 */
 abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;

    protected Vehicle() {
    }

    protected Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


}
