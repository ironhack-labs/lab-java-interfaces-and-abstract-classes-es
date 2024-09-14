package Sistemadeinventariodeautomoviles;

public class UtilityVehicle extends Car{
private boolean fourWheelDrive;


    public UtilityVehicle(String vinNumber, String make, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, mileage);
        this.fourWheelDrive= fourWheelDrive;

    }
}
