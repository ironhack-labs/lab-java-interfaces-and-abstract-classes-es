// Clase abstracta Car
public abstract class Car {
    String vinNumber;
    String make;
    String model;
    int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getInfo() {
        return "VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: " + mileage;
    }
}
//
//// Clase Sedan
//class Sedan extends Car {
//    public Sedan(String vinNumber, String make, String model, int mileage) {
//        super(vinNumber, make, model, mileage);
//    }
//}
//
//// Clase UtilityVehicle
//class UtilityVehicle extends Car {
//    boolean fourWheelDrive;
//
//    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
//        super(vinNumber, make, model, mileage);
//        this.fourWheelDrive = fourWheelDrive;
//    }
//
//    @Override
//    public String getInfo() {
//        return super.getInfo() + ", Four-Wheel Drive: " + (fourWheelDrive ? "Yes" : "No");
//    }
//}
//
//// Clase Truck
//class Truck extends Car {
//    double towingCapacity;
//
//    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
//        super(vinNumber, make, model, mileage);
//        this.towingCapacity = towingCapacity;
//    }
//
//    @Override
//    public String getInfo() {
//        return super.getInfo() + ", Towing Capacity: " + towingCapacity + " kg";
//    }
//}
//
//// Método que puedes llamar desde Main.java
//public class CarInventory {
//    public static void runInventory() {
//        Sedan sedan = new Sedan("1HGCM82633A004352", "Toyota", "Camry", 50000);
//        System.out.println(sedan.getInfo());
//
//        UtilityVehicle suv = new UtilityVehicle("2T2ZZMCA7KC123456", "Honda", "CR-V", 30000, true);
//        System.out.println(suv.getInfo());
//
//        Truck truck = new Truck("1FTWW33F1XEC12345", "Ford", "F-150", 70000, 5000);
//        System.out.println(truck.getInfo());
//    }
//}
