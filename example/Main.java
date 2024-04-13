package org.example;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("123ABC", "Toyota", "Corolla", 25000, 4);
        UtilityVehicle utilityVehicle = new UtilityVehicle("456DEF", "Jeep", "Wrangler", 15000, true);
        Truck truck = new Truck("789GHI", "Ford", "F-150", 30000, 2.5);

        System.out.println(sedan.getInfo());
        System.out.println(utilityVehicle.getInfo());
        System.out.println(truck.getInfo());
    }
}
