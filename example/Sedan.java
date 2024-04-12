package org.example;

public class Sedan extends Car {
    private int numberOfDoors;

    public Sedan(String vinNumber, String make, String model, int mileage, int numberOfDoors) {
        super(vinNumber, make, model, mileage);
        this.numberOfDoors = numberOfDoors;
    }


    @Override
    public String getInfo() {
        return String.format("Sedan: %s %s, VIN: %s, Mileage: %d miles, Doors: %d",
                getMake(), getModel(), getVinNumber(), getMileage(), numberOfDoors);
    }
}
