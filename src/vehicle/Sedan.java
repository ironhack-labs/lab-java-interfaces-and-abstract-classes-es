package vehicle;

public class Sedan extends Car {

    public String getInfo() {
        return String.format("Car{ vinNumber= %s, make= %s, model= %s, mileage= %s}", vinNumber, make, model, mileage);
    }


    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }


}
