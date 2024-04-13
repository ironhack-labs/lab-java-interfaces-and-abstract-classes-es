public class Main {
    public static void main(String[] args) {

        Sedan sedan = new Sedan("123456789", "Toyota", "Camry", 50000);
        UtilityVehicle utilityVehicle = new UtilityVehicle("987654321", "Ford", "Explorer", 40000, true);
        Truck truck = new Truck("555555555", "Chevrolet", "Silverado", 60000, 10000);

        System.out.println(sedan.getInfo());
        System.out.println(utilityVehicle.getInfo());
        System.out.println(truck.getInfo());
    }
}