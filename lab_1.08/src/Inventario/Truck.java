package Inventario;

import Inventario.Car;

public class Truck extends Car {
    private double towingCapacity;
    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Towing Capacity: " + towingCapacity * 1000 + "Kg";
    }

    @Override
    public String getType() {
        return "Inventario.Truck";
    }
}
