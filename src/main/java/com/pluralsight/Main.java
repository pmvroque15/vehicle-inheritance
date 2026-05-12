package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Moped moped = new Moped();

        //Inheritance of Moped extending Vehicle class
        moped.setColor("Black");
        moped.setCargoCapacity(2);
        moped.setFuelCapacity(3);

        Car car = new Car();

        car.setCargoCapacity(5);
        car.setColor("Midnight gray");
        car.setFuelCapacity(6);

        SemiTruck semiTruck = new SemiTruck();

        semiTruck.setColor("White");
        semiTruck.setCargoCapacity(4);
        semiTruck.setFuelCapacity(8);

        Hovercraft hovercraft = new Hovercraft();

        hovercraft.setColor("Black");
        hovercraft.setCargoCapacity(10);
        hovercraft.setFuelCapacity(20);

        vehicles.add(moped);
        vehicles.size();

        int number = 0;
        for (Vehicle v : vehicles) {
            number++;
            System.out.printf("VEHICLE %s %nCOLOR: %s | CARGO CAPACITY: %s | FUEL CAPACITY: %s %n", number, v.getColor(), v.getCargoCapacity(), v.getFuelCapacity());
        }

        if (vehicles.isEmpty()) {
            System.out.println("Naur vehicles");
        }


    }
}