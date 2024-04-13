import Automoviles.Sedan;
import Automoviles.Truck;
import Automoviles.UtilityVehicle;
import Interfaz.IntArrayList;
import Interfaz.IntVector;
import Video.Movie;
import Video.TvSeries;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        //BigDecimal
        BigDecimal bd = new BigDecimal("4.2545");
        BigDecimal bd2 = new BigDecimal("-13.3567");
        System.out.println(bigDecimalRedondeo(bd));
        System.out.println(bigDecimalCambiaSigno(bd2));

        //Vehicles
        UtilityVehicle utility1 = new UtilityVehicle("6536-JHF", "Toyota", "Land Cruiser", 120000, true);
        Truck truck1 = new Truck("1123-DFE", "Volvo", "Gama FH", 234000, 5.7);
        Sedan sedan1 = new Sedan("4658-HGJ", "Opel", "Corsa", 65000, "diesel");

        System.out.println(utility1.getInfo());
        System.out.println(truck1.getInfo());
        System.out.println(sedan1.getInfo());

        //Video Streaming
        TvSeries serie1 = new TvSeries("Black Mirror", 45, 30);
        TvSeries serie2 = new TvSeries("What if...?", 24, 25);
        TvSeries serie3 = new TvSeries("Juego de tronos", 50, 60);
        Movie movie1 = new Movie("Dune", 143, 7.8);
        Movie movie2 = new Movie("El viaje de Chihiro", 118, 8.7);

        System.out.println(serie3.getInfo());
        System.out.println(movie2.getInfo());

        //Interfaz IntList
        IntVector intVector1 = new IntVector ();
        IntArrayList intArrayList1 = new IntArrayList();



        intVector1.add(34);
        intVector1.add(32);
        intVector1.add(3);
        intVector1.add(65);
        intVector1.add(78);
        intVector1.add(1);
        intVector1.add(47);
        intVector1.add(23);
        intVector1.add(43);
        intVector1.add(867);
        intVector1.add(4);
        intVector1.add(56);
        intVector1.add(89);

        intArrayList1.add(32);
        intArrayList1.add(67);
        intArrayList1.add(67);
        intArrayList1.add(67);
        intArrayList1.add(89);
        intArrayList1.add(89);
        intArrayList1.add(89);
        intArrayList1.add(89);
        intArrayList1.add(89);
        intArrayList1.add(89);
        intArrayList1.add(89);
        intArrayList1.add(89);
        intArrayList1.add(89);
        intArrayList1.add(829);
        intArrayList1.add(893);

        intVector1.get(2);
        intVector1.get(10);
        intArrayList1.get(0);
    }

    //BigDecimal
    private static double bigDecimalRedondeo(BigDecimal bd){
        bd = bd.setScale(2, RoundingMode.HALF_EVEN);
        return bd.doubleValue();
    }

    private static BigDecimal bigDecimalCambiaSigno(BigDecimal bd2){
        bd2 = bd2.setScale(1, RoundingMode.HALF_EVEN);
        return bd2.negate();
    }
}