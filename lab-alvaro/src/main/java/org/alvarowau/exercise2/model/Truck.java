package org.alvarowau.exercise2.model;

public final class Truck extends Car {

    private double towingCapacity;


    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        // Incluye la capacidad de remolque con una unidad de medida (kg en este caso)
        return String.format("VIN: %s\nMarca: %s\nModelo: %s\nKilometraje: %d km\nCapacidad de remolque: %.2f kg",
                getVinNumber(), getMake(), getModel(), getMileage(), towingCapacity);
    }
}
