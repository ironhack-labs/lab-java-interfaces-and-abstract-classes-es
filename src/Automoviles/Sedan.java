package Automoviles;

import Automoviles.Car;

public class Sedan extends Car {
    private String fuel;

    public Sedan(String vinNumber, String make, String model, int mileage, String fuel) {
        super(vinNumber, make, model, mileage);
        this.fuel = fuel;
    }

    @Override
    public String getInfo() {
        return "Type: Automoviles.Sedan\n"+
                super.getInfo()
                +"Fuel: "+ fuel+"\n";
    }
}

