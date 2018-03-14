package hw04_OOPPrinciples.p08_Vehicles;

/**
 * Created by fluch on 3/13/2018.
 */
class Truck extends Vehicle {
    public Truck() {
    }

     Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 1.6);
    }


    @Override
    protected void refuel(double fuel) {
        super.refuel(fuel * 0.95);
    }
}
