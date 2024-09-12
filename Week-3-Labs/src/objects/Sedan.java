package objects;

public class Sedan extends Car{
  public Sedan(String vinNumber, String make, String model, int mileage) {
    super(vinNumber, make, model, mileage);
  }
  @Override
  public void getInfo() {
    System.out.println("Vehicle: Sedan\nVinNumber= " + this.vinNumber + "\nMake= " + this.make + "\nModel: " + this.model + "\nMileage: " + this.mileage );
  }
}
