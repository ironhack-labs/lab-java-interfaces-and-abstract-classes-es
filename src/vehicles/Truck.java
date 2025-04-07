package vehicles;

public class Truck extends Car{

    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    //Capacidad de remolque del camion.
    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public void getInfo() {
        System.out.println("Truck --> VIN Number: " + getVinNumber()
                + ", Make: " + getMake()
                + ", Model: " + getModel()
                + ", Mileage: " + getMileage()
                + ", TowingCapacity: " + getTowingCapacity());
    }
}
