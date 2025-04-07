package vehicles;

public class Sedan extends Car {

    public Sedan(String vinNumber, String make, String model, int mileage) {

        super(vinNumber, make, model, mileage);
    }

    @Override
    public void getInfo() {
        System.out.println("Sedan --> VIN Number: " + getVinNumber()
                + ", Make: " + getMake()
                + ", Model: " + getModel()
                + ", Mileage: " + getMileage());
    }
}