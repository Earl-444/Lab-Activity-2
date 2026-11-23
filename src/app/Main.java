package app;

import contracts.Serviceable;
import devices.Printer;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Truck;
import vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Vios", 2020, 4);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Mio", 2022, "Automatic");
        // The existing Truck constructor takes an int for numberOfWheels.
        Truck truck = new Truck("Isuzu", "N-Series", 2021, 5);

        Vehicle[] v = { car, motorcycle, truck };
        for (Vehicle vehicle : v) {
            vehicle.move();
        }

        Serviceable[] serviceItems = { car, motorcycle, truck, new Printer() };
        for (Serviceable item : serviceItems) {
            item.service();
        }
    }
}
