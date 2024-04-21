package Inventario;

import Inventario.Car;

public class Sedan extends Car {
    public boolean Sedan;

    public Sedan (String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override // me lo propuso Ineliji, pero no lo entiendo muy bien...
    public String getType() {
        return null;
    }
}
