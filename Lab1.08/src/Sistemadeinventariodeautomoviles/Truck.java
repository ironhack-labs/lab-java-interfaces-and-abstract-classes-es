package Sistemadeinventariodeautomoviles;

public class Truck extends Car{
private double towingCapacity;

    public Truck(String vinNumber, String make, int mileage, double towingCapacity) {
        super(vinNumber, make, mileage);
        this.towingCapacity = towingCapacity;
    }
}
