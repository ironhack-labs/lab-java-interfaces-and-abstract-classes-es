package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("1HGCM82633A123456", "Honda", "Accord", 50000);
        UtilityVehicle vehicle1= new UtilityVehicle("2T3ZF4DV7BW123456", "Toyota", "RAV4", 60000, true);
        Truck truck= new Truck("1FTSW21P07EA12345", "Ford", "F-150", 75000, 3500.5);

        System.out.println("Toda la información:");
        System.out.println(sedan.getInfo());
        System.out.println(vehicle1.getInfo());
        System.out.println(truck.getInfo());

    }
}