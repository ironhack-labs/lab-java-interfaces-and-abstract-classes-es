
public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean hasFourWheelDrive() {
        return fourWheelDrive;
    }

    @Override
    public String getInfo() {
        String driveType = fourWheelDrive ? "4WD" : "2WD";
        return "Utility Vehicle: VIN " + getVinNumber() + ", Make: " + getMake() + ", Model: " + getModel() + ", Mileage: " + getMileage() + " miles, Drive Type: " + driveType;
    }
}
