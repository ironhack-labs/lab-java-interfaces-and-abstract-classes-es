package org.alvarowau.exercise2.model;

public final class UtilityVehicle extends Car {

    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        // Incluye información sobre la tracción a las cuatro ruedas
        String fourWheelDriveInfo = fourWheelDrive ? "sí" : "no";
        return String.format("VIN: %s\nMarca: %s\nModelo: %s\nKilometraje: %d km\nTracción a las cuatro ruedas: %s",
                getVinNumber(), getMake(), getModel(), getMileage(), fourWheelDriveInfo);
    }
}
