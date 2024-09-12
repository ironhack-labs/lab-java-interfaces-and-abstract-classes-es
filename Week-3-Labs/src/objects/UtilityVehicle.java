package objects;

public class UtilityVehicle extends Car{
  protected boolean fourWheelDrive;
  public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
    super(vinNumber, make, model, mileage);
    this.fourWheelDrive = fourWheelDrive;
  }

  @Override
  public void getInfo() {
    System.out.println("Vehicle: Sedan\nVinNumber= " + this.vinNumber + "\nMake= " + this.make + "\nModel: " + this.model + "\nMileage: " + this.mileage + "\nFour wheel drive: "+ this.fourWheelDrive);
  }
}
