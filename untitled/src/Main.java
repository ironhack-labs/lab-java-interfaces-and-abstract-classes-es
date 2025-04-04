import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static double roundTwo(BigDecimal number) {
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }
public static double invert(BigDecimal number){
        BigDecimal inverted = number.negate();
        BigDecimal rounded = inverted.setScale(1, RoundingMode.HALF_UP);
        return rounded.doubleValue();
}
    public static void main(String[] args) {

        System.out.println("ERCERCICE 1 ---------- BIG DECIMAL");
        BigDecimal num1 = new BigDecimal("4.2565");
        BigDecimal num2 = new BigDecimal("-9.548");

        System.out.println(roundTwo(num1));
        System.out.println(invert(num1));
        System.out.println(roundTwo(num2));
        System.out.println(invert(num2));

        System.out.println("\nEXERCICIE 2 ----------");
        Car Sedan = new Sedan("891223","Cheverolet","Aveo",15000);
        Car UtilityVehicle = new UtilityVehicle("654321", "Jeep", "Cherokee", 20000, true);
        Car Truck = new Truck("789012", "Ford", "F-150", 25000,4.6);


        System.out.println(Sedan.getInfo());
        System.out.println(UtilityVehicle.getInfo());
        System.out.println(Truck.getInfo());

        System.out.println("\nEXERCICE 3---------");
        Video movie = new Movie("Harry Potter",120,9.5);
        Video tvserie = new TvSeries("El cor de la ciutat",30,500);

        System.out.println(movie.getInfo());
        System.out.println(tvserie.getInfo());

        System.out.println("\nEXERCICE 4---------");

        InList arrayList = new IntArrayList();
        System.out.println("\nTesting IntArrayList:");
        for (int i = 0; i < 17; i++) {
            arrayList.add(i * 2);
        }
        for (int i = 0; i < 17; i++) {
            System.out.println("Element at index " + i + ": " + arrayList.get(i));
        }


        InList vector = new IntVector();
        System.out.println("\nTesting IntVector:");
        for (int i = 0; i < 25; i++) {
            vector.add(i * 3);
        }
        for (int i = 0; i < 25; i++) {
            System.out.println("Element at index " + i + ": " + vector.get(i));
        }



    }

}






