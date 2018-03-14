package hw04_OOPPrinciples.p08_Vehicles;

/**
 * Created by fluch on 3/13/2018.
 */
class Car extends Vehicle {


    Car() {
    }

    Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 0.9);
    }


}
