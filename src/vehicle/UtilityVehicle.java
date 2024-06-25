package vehicle;

public class UtilityVehicle extends Car{

    protected boolean fourWheelDrive;

    public String getInfo() {
        return String.format("Car{ vinNumber= %s, make= %s, model= %s, mileage= %s, fourWheelDrive= %s}", vinNumber, make, model, mileage, fourWheelDrive);
    }


    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }
}
