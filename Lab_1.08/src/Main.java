import InterfazIntList.IntArrayList;
import InterfazIntList.IntList;
import InterfazIntList.IntVector;
import automoviles.Sedan;
import automoviles.Truck;
import automoviles.UtilityVehicle;
import transmisionVideo.Movie;
import transmisionVideo.TvSeries;

import java.math.BigDecimal;
import java.math.RoundingMode;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("------BIG DECIMAL------");
        //OPERACIONES BIG DECIMAL
        operacionesBigDecimal();

        System.out.println("-----------");
        System.out.println("------INVENTARIO DE AUTOMOVILES------");
        //SISTEMA DE INVENTARIO DE AUTOMOVILE
        inventarioDeAutomoviles();

        System.out.println("-----------");
        System.out.println("------TRANSMISION DE VIDEO------");
        //SERVICIO DE TRANSMICION DE VIDEO
        transmisionDeVideo();

        System.out.println("-----------");
        System.out.println("------INTERFAZ INT LIST------");
        //INTERFAZ INTLIST

        interfazIntList();
    }

    private static void operacionesBigDecimal() {
        BigDecimal num1 = new BigDecimal("8.73782");
        BigDecimal num2 = new BigDecimal("2.32345");
        BigDecimal num3 = new BigDecimal("-5.6327");

        System.out.println("Redondeo de \"8.73782\": " + redondearAlCentesimo(num1));
        System.out.println("Redondeo de \"2.32345\": " + redondearAlCentesimo(num2));
        System.out.println("Redondeo de \"-5.6327\": " + redondearAlCentesimo(num3));


        BigDecimal num4 = new BigDecimal("32.7673");
        BigDecimal num5 = new BigDecimal("-4.2127");

        System.out.println("Resultado de invertir y redondear \"32.7673\": " + invertirYRedondear(num4));
        System.out.println("Resultado de invertir y redondear \"-4.2127\": " + invertirYRedondear(num5));
    }

    public static double redondearAlCentesimo(BigDecimal numero) {
        BigDecimal redondeado = numero.setScale(2, RoundingMode.HALF_UP);
        return redondeado.doubleValue();}

    public static BigDecimal invertirYRedondear(BigDecimal numero) {
        BigDecimal invertido = numero.negate();
        return invertido.setScale(1, RoundingMode.HALF_UP);

    }

    private static void inventarioDeAutomoviles() {
        Sedan sedan = new Sedan("123456", "Toyota", "Camry", 50000);
        UtilityVehicle utilityVehicle = new UtilityVehicle("789012", "Jeep", "Wrangler", 75000, true);
        Truck truck = new Truck("345678", "Ford", "F-150", 100000, 12000.0);

        System.out.println(sedan.getInfo());
        System.out.println(utilityVehicle.getInfo());
        System.out.println(truck.getInfo());
    }

    private static void transmisionDeVideo() {
        TvSeries gotSeries = new TvSeries("Game of Thrones", 60, 73);
        Movie inceptionMovie = new Movie("Inception", 148, 8.8);

        System.out.println(gotSeries.getInfo());
        System.out.println(inceptionMovie.getInfo());
    }

    private static void interfazIntList() {
        IntList list1 = new IntArrayList();
        list1.add(5);
        list1.add(10);
        System.out.println("Elemento en ID 1 (IntArrayList): " + list1.get(1));

        IntList list2 = new IntVector();
        list2.add(15);
        list2.add(20);
        System.out.println("Elemento en ID 1 (IntVector): " + list2.get(1));
    }
}