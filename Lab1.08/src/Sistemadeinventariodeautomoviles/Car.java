package Sistemadeinventariodeautomoviles;

public abstract class Car {
    private String vinNumber;
    private String make;
    private int mileage;

    public Car(String vinNumber, String make, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.mileage = mileage;
    }

    public void getInfo(String ConsultAuto){

    }

    public String getVinNumber() {
        return vinNumber;
    }
    public String getMake() {
        return make;
    }
    public int getMileage() {
        return mileage;
    }
    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
