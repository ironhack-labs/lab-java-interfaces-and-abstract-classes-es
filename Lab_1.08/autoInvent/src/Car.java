abstract class Car {
    String vinNumber;
    String make;
    String model;
    int mileage;

    public Car (String vinNumber, String make, String model, int mileage){

        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;

    }
    public String getInfo() {

        return "VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: " + mileage;
    }


}
