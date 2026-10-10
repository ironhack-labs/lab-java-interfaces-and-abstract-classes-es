package com.ironhack.lab.cars;

/**
 * A utility vehicle, which additionally records whether it has four-wheel
 * drive.
 */
public class UtilityVehicle extends Car {

    /** Whether the vehicle drives all four wheels. */
    private boolean fourWheelDrive;

    /**
     * Creates a utility vehicle.
     *
     * @param vinNumber      the vehicle identification number
     * @param make           the manufacturer
     * @param model          the model name
     * @param mileage        the mileage in miles
     * @param fourWheelDrive {@code true} if the vehicle has four-wheel drive
     */
    public UtilityVehicle(String vinNumber, String make, String model, int mileage,
                          boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Type: Utility Vehicle | Four-wheel drive: "
                + (fourWheelDrive ? "yes" : "no");
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }
}
