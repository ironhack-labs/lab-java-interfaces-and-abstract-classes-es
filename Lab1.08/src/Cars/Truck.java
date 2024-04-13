package Cars;

public class Truck extends Car{
    private double towingCapacity; // representa la capacidad de remolque del camión.

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return "Truck {" +
                "vinNumber='" + getVinNumber() + '\'' +
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", mileage='" + getMileage() + '\'' +
                ", towingCapacity=" + towingCapacity +
                '}';
    }
}
