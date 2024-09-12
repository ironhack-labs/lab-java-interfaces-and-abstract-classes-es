package objects;

public class Truck extends Car{
  protected double towingCapacity;
  public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
    super(vinNumber, make, model, mileage);
    this.towingCapacity = towingCapacity;
  }

  @Override
  public void getInfo() {
    System.out.println("Vehicle: Sedan\nVinNumber= " + this.vinNumber + "\nmake= " + this.make + "\nModel: " + this.model + "\nMileage: " + this.mileage + "\nBound capacity: "+ this.towingCapacity);
  }
}
