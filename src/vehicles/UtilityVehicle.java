package vehicles;

public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    //UtilityVehicle si el vehiculo tiene traccion a las 4 ruedas
    public boolean getFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }


    @Override
    public void getInfo() {

        if(fourWheelDrive){
        System.out.println("UtilityVehicle --> VIN Number: " + getVinNumber()
                + ", Make: " + getMake()
                + ", Model: " + getModel()
                + ", Mileage: " + getMileage()
                + ", FourWheelDrive: Sí.");
        }else {
            System.out.println("UtilityVehicle --> VIN Number: " + getVinNumber()
                    + ", Make: " + getMake()
                    + ", Model: " + getModel()
                    + ", Mileage: " + getMileage()
                    + ", FourWheelDrive: No.");
        }
    }


}
