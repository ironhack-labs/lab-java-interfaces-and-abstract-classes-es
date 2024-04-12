package org.example;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        String driveType = fourWheelDrive ? "4WD" : "2WD";
        return String.format("Utility Vehicle: %s %s, VIN: %s, Mileage: %d miles, Drive: %s",
                getMake(), getModel(), getVinNumber(), getMileage(), driveType);
    }
}
