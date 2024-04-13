package Cars;

abstract class Car {
    private String vinNumber; // representa el número de VIN del automóvil
    private String make; // representa la marca del automóvil
    private String model; // representa el modelo del automóvil
    private int mileage; // representa el kilometraje del automóvil

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    // método que devuelve un String que contiene todas las propiedades del automóvil en un formato legible
    public abstract String getInfo();

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
}
