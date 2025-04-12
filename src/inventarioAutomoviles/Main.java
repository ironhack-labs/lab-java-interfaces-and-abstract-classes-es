package inventarioAutomoviles;

public class Main {

    public static void main(String[] args){


        Car sedan1 = new Sedan("123453F101", "Toyota", "Corolla", 5000);
        Car sedan2 = new Sedan("ASF2242DSZ", "Renault", "Clio", 35000);
        Car sedan3 = new Sedan("10DDD2T303", "Fiat", "Palio", 15000);


        Car utilityVehicle1 = new UtilityVehicle("JHRSD242DSZ", "Nissan", "Qashqai", 20000, true);
        Car utilityVehicle2 = new UtilityVehicle("DFGJJ242DSZ", "Ford", "Fiesta", 45000, true);
        Car utilityVehicle3 = new UtilityVehicle("KYTREW42DSZ", "Jeep", "Grand Cherokee", 30000, true);


        Car truck1 = new Truck("AWEWSF22SZ", "Ford", "Focus", 120000, 6000);
        Car truck2 = new Truck("ASF22FEESZ", "Chevrolet", "Corsa", 80000, 8000);
        Car truck3 = new Truck("HYDFASF22D", "Ram", "1500", 95000, 7000);

        System.out.println("Vehiculos Sedan:");
        System.out.println(sedan1.getInfo());
        System.out.println(sedan2.getInfo());
        System.out.println(sedan3.getInfo());

        System.out.println("\nVehiculos Utility:");
        System.out.println(utilityVehicle1.getInfo());
        System.out.println(utilityVehicle2.getInfo());
        System.out.println(utilityVehicle3.getInfo());

        System.out.println("\nVehiculos Trucks:");
        System.out.println(truck1.getInfo());
        System.out.println(truck2.getInfo());
        System.out.println(truck3.getInfo());

    }

}
