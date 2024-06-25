import inte.IntArrayList;
import inte.IntLIst;
import inte.IntVector;

import vehicle.Truck;
import vehicle.UtilityVehicle;
import watch.Movie;
import watch.TvSeries;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args){

        Cine();

        CarsInfo();

        BD();

    }

    private static void Cine() {
        Movie n21 = new Movie("Spartacus", 114,87);
        System.out.println(n21.getInfoVideo());

        TvSeries ABC = new TvSeries("Fringe", 50,68);
        System.out.println(ABC.getInfoVideo());
    }

    private static void CarsInfo() {
        Truck n3 = new Truck("ES14515P","Ford","Focus",22000, 3000);
        System.out.println(n3.getInfo());
        UtilityVehicle n34 = new UtilityVehicle("ES89741S","Renault","Megan",50000,true);
        System.out.println(n34.getInfo());
    }

    private static void BD() {
        BigDecimal a = new BigDecimal("4.2545").setScale(2,RoundingMode.HALF_DOWN);

        double b = a.doubleValue();
        System.out.println(b);

        BigDecimal x = new BigDecimal("1.2345").setScale(2, RoundingMode.HALF_DOWN).negate();
        double y = x.doubleValue();
        System.out.println(y);

        BigDecimal c = new BigDecimal("-45.67").setScale(1, RoundingMode.HALF_DOWN).negate();
        double d = c.doubleValue();
        System.out.println(d);
    }



        IntArrayList  IntArrayList = new IntArrayList();
         for(int i=0; i<10; i++) {
            IntArrayList.add(i);

        IntVector IntVector = new IntVector();
         for(int i=0; i<20; i++) {
             IntVector.add(i);
}