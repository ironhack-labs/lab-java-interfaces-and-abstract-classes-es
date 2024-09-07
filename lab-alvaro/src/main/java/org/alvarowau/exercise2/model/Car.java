package org.alvarowau.exercise2.model;

public sealed abstract class Car permits Sedan,  UtilityVehicle, Truck{
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * Devuelve una cadena con la información del coche.
     *
     * @return Información completa del coche en formato de cadena.
     */
    public String getInfo() {
        return String.format("VIN: %s\nMarca: %s\nModelo: %s\nKilometraje: %d km",
                vinNumber, make, model, mileage);
    }
}
