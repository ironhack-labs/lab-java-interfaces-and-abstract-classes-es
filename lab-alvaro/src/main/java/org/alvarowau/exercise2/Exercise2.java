package org.alvarowau.exercise2;

import org.alvarowau.exercise2.model.Car;
import org.alvarowau.exercise2.model.Sedan;
import org.alvarowau.exercise2.model.Truck;
import org.alvarowau.exercise2.model.UtilityVehicle;

public class Exercise2 {


    public static void start(){
        Car sedan = new Sedan("1HGBH41JXMN109186", "Honda", "Civic", 50000);
        Car truck = new Truck("2FMDK3KC1AB123456", "Ford", "F-150", 30000, 5000.0);
        // Crear un UtilityVehicle con tracción a las cuatro ruedas
        Car utilityVehicleWithFourWheelDrive = new UtilityVehicle("3TMCZ5AN2LM123456", "Jeep", "Wrangler", 40000, true);
        // Crear un UtilityVehicle sin tracción a las cuatro ruedas
        Car utilityVehicleWithoutFourWheelDrive = new UtilityVehicle("4TMCZ5AN3LM654321", "Toyota", "4Runner", 60000, false);

        System.out.println("Información del Sedan:");
        System.out.println(sedan.getInfo());

        System.out.println("\nInformación del Truck:");
        System.out.println(truck.getInfo());

        System.out.println("\nInformación del Utility Vehicle con tracción a las cuatro ruedas:");
        System.out.println(utilityVehicleWithFourWheelDrive.getInfo());

        System.out.println("\nInformación del Utility Vehicle sin tracción a las cuatro ruedas:");
        System.out.println(utilityVehicleWithoutFourWheelDrive.getInfo());
    }
}
