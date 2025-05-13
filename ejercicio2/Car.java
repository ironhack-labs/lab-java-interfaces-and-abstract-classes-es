package ejercicio2;

public abstract class Car {

    protected String vinNumber; //representa el número de VIN del automóvil
    protected String make; //representa la marca del automóvil
    protected String model; //representa el modelo del automóvil
    protected int mileage; //representa el kilometraje del automóvil

    //constructor
    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public String getInfo() {
        return "VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: " + mileage;
    }
}


