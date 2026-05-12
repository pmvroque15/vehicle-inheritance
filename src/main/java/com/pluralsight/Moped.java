package com.pluralsight;

public class Moped extends  Vehicle{
    private boolean isElectric;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity ) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public Moped(String color, int numberOfPassengers, int cargoCapacity, boolean isElectric) {
        super(color, numberOfPassengers, cargoCapacity);

        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
