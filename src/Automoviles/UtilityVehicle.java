package Automoviles;

import Automoviles.Car;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;;
    }

    @Override
    public String getInfo() {
        return "Type: Utility Vehicle\n"+
       super.getInfo()
        +"4x4: "+ fourWheelDrive+"\n";
    }
}
