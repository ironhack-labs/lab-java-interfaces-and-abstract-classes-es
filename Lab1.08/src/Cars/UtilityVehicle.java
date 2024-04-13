package Cars;

public class UtilityVehicle extends Car{
    private boolean fourWheelDrive; // representa si el vehículo tiene tracción en las cuatro ruedas

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
        return "UtilityVehicle {" +
                "vinNumber='" + getVinNumber() + '\'' +
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", mileage='" + getMileage() + '\'' +
                ", fourWheelDrive=" + fourWheelDrive +
                '}';
    }
}
