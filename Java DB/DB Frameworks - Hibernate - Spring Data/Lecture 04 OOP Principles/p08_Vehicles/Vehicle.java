package hw04_OOPPrinciples.p08_Vehicles;

import java.text.DecimalFormat;

/**
 * Created by fluch on 3/13/2018.
 */
abstract class Vehicle {
    private double fuel;
    private double consumption;

    Vehicle() {
    }

    Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuel = fuelQuantity;
        this.consumption = fuelConsumption;
    }

    private void setFuel(double fuel) {
        this.fuel = fuel;
    }

    protected void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    protected void refuel(double fuel) {
        if (fuel >= 0) {
            this.fuel += fuel;
        }
    }

    void drive(double distance) {
        double neededFuel = consumption * distance;
        if (neededFuel > fuel) {
            System.out.println(getClass().getSimpleName() + " needs refueling");
        } else {
            fuel -= neededFuel;

            System.out.println(String.format("%s travelled %s km", getClass().getSimpleName(), new DecimalFormat("#.##").format(distance)));
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), fuel);
    }
}
