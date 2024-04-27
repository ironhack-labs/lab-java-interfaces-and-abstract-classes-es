import Classes.Sedan;
import Classes.Trucks;
import Classes.UtilityVehicle;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        bigDecimalOperations();
        carClasses();

    }

    private static void bigDecimalOperations() {
        BigDecimal a = new BigDecimal("4.2545");

        double result = returnDouble(a);
        System.out.println(result);

        BigDecimal b = new BigDecimal("1.2345");
        BigDecimal c = new BigDecimal("-45.67");

        System.out.println(signChange(b));
        System.out.println(signChange(c));
    }

    private static double returnDouble(BigDecimal numero) {
        return numero
                .setScale(2, RoundingMode.DOWN)
                .doubleValue();
    }

    private static BigDecimal signChange(BigDecimal numero) {
        return numero
                .negate()
                .setScale(1, RoundingMode.CEILING);
    }

    private static void carClasses() {
        Sedan vehicle1 = new Sedan("111111", "Toyota", "Camry", 100);
        UtilityVehicle vehicle2 = new UtilityVehicle("222222", "Ford", "Explorer", 1000, true);
        Trucks vehicle3 = new Trucks("333333", "Chevrolet", "Silverado", 600, 100);

        System.out.println(vehicle1.getInfo());
        System.out.println(vehicle2.getInfo());
        System.out.println(vehicle3.getInfo());
    }

}