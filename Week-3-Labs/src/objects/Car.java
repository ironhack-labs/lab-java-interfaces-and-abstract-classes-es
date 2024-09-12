package objects;

public abstract class Car {
  protected String vinNumber;
  protected String make;
  protected String model;
  protected int mileage;

  public abstract void getInfo();

  public Car(String vinNumber, String make, String model, int mileage) {
    this.vinNumber = vinNumber;
    this.make = make;
    this.model = model;
    this.mileage = mileage;
  }
}
