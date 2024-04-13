package automoviles;

public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return "Utility Vehicle: VIN " + getVinNumber() + ", Make: " + getMake() + ", Model: " + getModel() +
                ", Mileage: " + getMileage() + ", 4WD: " + (fourWheelDrive ? "Yes" : "No");
    }
}
