abstract class Car {
    public String vinNumber;

    public String make;
    public String model;
    public int mileage;

    public String getInfo() {
        return vinNumber + ", " + make + ", " + model + ", " + mileage + "\n";
    }
}
