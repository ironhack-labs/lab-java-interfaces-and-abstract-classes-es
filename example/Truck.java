package org.example;

public class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return String.format("Truck: %s %s, VIN: %s, Mileage: %d miles, Towing Capacity: %.2f tons",
                getMake(), getModel(), getVinNumber(), getMileage(), towingCapacity);
    }
}
