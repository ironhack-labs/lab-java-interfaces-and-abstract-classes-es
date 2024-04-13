// UtilityVehicle.java
public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return "Utility Vehicle Info: VIN - " + vinNumber + ", Make - " + make + ", Model - " + model + ", Mileage - " + mileage + ", 4WD - " + fourWheelDrive;
    }
}