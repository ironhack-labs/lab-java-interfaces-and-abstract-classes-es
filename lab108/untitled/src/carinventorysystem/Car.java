package carinventorysystem;

public abstract class Car {
    protected String vinNumber; //representing car VIN number
    protected String make; //representing brand
    protected String model; //representing model
    protected int mileage; // representing mileage

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public abstract String getInfo(); //returns string containing all car properties in a legible format
}
