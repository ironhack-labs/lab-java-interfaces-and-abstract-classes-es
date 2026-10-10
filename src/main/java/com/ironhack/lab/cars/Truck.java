package com.ironhack.lab.cars;

import java.util.Locale;

/**
 * A truck, which additionally records how much weight it can tow.
 */
public class Truck extends Car {

    /** Maximum weight the truck can tow, in pounds. */
    private double towingCapacity;

    /**
     * Creates a truck.
     *
     * @param vinNumber      the vehicle identification number
     * @param make           the manufacturer
     * @param model          the model name
     * @param mileage        the mileage in miles
     * @param towingCapacity the towing capacity in pounds
     */
    public Truck(String vinNumber, String make, String model, int mileage,
                 double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The towing capacity is formatted with {@link Locale#US} so the
     * decimal separator does not change with the machine's locale.</p>
     */
    @Override
    public String getInfo() {
        return super.getInfo()
                + String.format(Locale.US, " | Type: Truck | Towing capacity: %.1f lbs",
                        towingCapacity);
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
