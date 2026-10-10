package com.ironhack.lab.cars;

/**
 * Base type of the car inventory.
 *
 * <p>No car is just a car, so this class is abstract: it holds the state and
 * behaviour every vehicle shares and cannot be instantiated on its own. Each
 * concrete vehicle is a {@link Sedan}, a {@link UtilityVehicle} or a
 * {@link Truck}.</p>
 *
 * <p>{@link #getInfo()} is concrete rather than abstract so the four shared
 * fields are formatted in exactly one place; subclasses call
 * {@code super.getInfo()} and append only what they add.</p>
 */
public abstract class Car {

    /** Vehicle identification number. */
    private String vinNumber;

    /** Manufacturer of the car, for example {@code "Toyota"}. */
    private String make;

    /** Model of the car, for example {@code "Corolla"}. */
    private String model;

    /** Distance the car has travelled, in miles. */
    private int mileage;

    /**
     * Creates a car with all of its shared properties.
     *
     * @param vinNumber the vehicle identification number
     * @param make      the manufacturer
     * @param model     the model name
     * @param mileage   the mileage in miles
     */
    protected Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    /**
     * Returns every property of the car in a readable, single-line format.
     *
     * @return a human readable description of the car
     */
    public String getInfo() {
        return String.format("VIN: %s | Make: %s | Model: %s | Mileage: %d miles",
                vinNumber, make, model, mileage);
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
