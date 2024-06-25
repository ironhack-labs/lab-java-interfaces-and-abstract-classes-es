package vehicle;

public class Truck extends Car{

    protected double towingCapacity;

    public String getInfo() {
        return String.format("Car{ vinNumber= %s, make= %s, model= %s, mileage= %s, towingCapacity= %s}", vinNumber, make, model, mileage, towingCapacity);
    }


    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }
}
