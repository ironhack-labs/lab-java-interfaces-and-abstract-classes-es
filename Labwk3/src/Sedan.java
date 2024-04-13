public class Sedan extends Car {
    private int numberOfDoors;

    public Sedan(String vinNumber, String make, String model, int mileage, int numberOfDoors) {
        super(vinNumber, make, model, mileage);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String getInfo() {
        return "Sedan: VIN " + getVinNumber() + ", Make: " + getMake() + ", Model: " + getModel() + ", Mileage: " + getMileage() + " miles, Number of Doors: " + numberOfDoors;
    }
}
