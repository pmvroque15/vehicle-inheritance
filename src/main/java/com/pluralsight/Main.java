package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Moped moped = new Moped("Black", 2, 3, 5);
        Moped moped1 = new Moped("Purple", 1, 1, false);
        //Inheritance of Moped extending Vehicle class
//        moped.setColor("Black");
//        moped.setCargoCapacity(2);
//        moped.setFuelCapacity(3);
//        moped.setFuelCapacity(5);
//
        Car car = new Car("Midnight gray", 5,5,6);

//        car.setCargoCapacity(5);
//        car.setColor("Midnight gray");
//        car.setFuelCapacity(6);
//        car.setNumberOfPassengers(5);

        SemiTruck semiTruck = new SemiTruck("White", 7,4,8);

//        semiTruck.setColor("White");
//        semiTruck.setCargoCapacity(4);
//        semiTruck.setFuelCapacity(8);
//        semiTruck.setNumberOfPassengers(7);


        Hovercraft hovercraft = new Hovercraft("Black", 20,10,20);

//        hovercraft.setColor("Black");
//        hovercraft.setCargoCapacity(10);
//        hovercraft.setFuelCapacity(20);
//        hovercraft.setNumberOfPassengers(20);

        vehicles.add(moped);
        vehicles.add(moped1);
        vehicles.add(semiTruck);
        vehicles.add(hovercraft);
        vehicles.add(car);

        int number = 0;
        for (Vehicle v : vehicles) {
            number++;
            if(v.getFuelCapacity() == 0) {
                System.out.println("TEST: No Fuel Capacity entered");
                System.out.printf("%nVEHICLE %d %nCOLOR: %s | CARGO CAPACITY: %d | FUEL CAPACITY: N/A | PASSENGER CAPACITY: %d | ELECTRIC: %s %n", number, v.getColor(), v.getCargoCapacity(), v.getNumberOfPassengers(), moped1.isElectric());
            }

            System.out.printf("%nVEHICLE %d %nCOLOR: %s | CARGO CAPACITY: %d | FUEL CAPACITY: %d | PASSENGER CAPACITY: %d %n", number, v.getColor(), v.getCargoCapacity(), v.getFuelCapacity(), v.getNumberOfPassengers());
            System.out.printf("Total number of Vehicles: %s%n", vehicles.size());
        }

        if (vehicles.isEmpty()) {
            System.out.println("Naur vehicles available");
        }


    }
}