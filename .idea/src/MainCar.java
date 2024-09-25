public class MainCar {
    public static void main(String[] args) {

        Car sedan = new Sedan("1HGCM82633A123456", "Honda", "Accord", 120000);
        System.out.println(sedan.getInfo());


        Car utilityVehicle = new UtilityVehicle("2FMGK5D85EBD12345", "Ford", "Explorer", 95000, true);
        System.out.println(utilityVehicle.getInfo());


        Car truck = new Truck("3C6UR5CL1EG123456", "Ram", "1500", 75000, 3.5);
        System.out.println(truck.getInfo());
    }
}
