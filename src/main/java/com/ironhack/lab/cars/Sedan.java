package com.ironhack.lab.cars;

/**
 * A passenger car.
 *
 * <p>The exercise gives {@code Sedan} no extra property, so this class adds
 * no state. It still overrides {@link #getInfo()} to label the vehicle type,
 * which keeps the inventory output consistent across the three subclasses.</p>
 */
public class Sedan extends Car {

    /**
     * Creates a sedan.
     *
     * @param vinNumber the vehicle identification number
     * @param make      the manufacturer
     * @param model     the model name
     * @param mileage   the mileage in miles
     */
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Type: Sedan";
    }
}
