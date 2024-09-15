package carinventorysystem;

public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan("1CRAYCRAY", "Toyota", "Corolla", 15000);
        Car suv = new UtilityVehicle("2K00L4SKOOL", "John Deere", "Gator", 20000, true);
        Car truck = new Truck("50ORYN07500RY", "GMC", "Hummer", 25000, 5000.5);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());
    }
}
