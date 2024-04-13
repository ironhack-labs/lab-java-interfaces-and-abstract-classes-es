import Cars.Sedan;
import Cars.Truck;
import Cars.UtilityVehicle;
import IntList.IntArrayList;
import IntList.IntVector;
import Videos.Movie;
import Videos.TvSeries;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        /*
        Operaciones BigDecimal

        1. Usando la documentación de BigDecimal, crea un método que acepte un BigDecimal y devuelva un double del número
        BigDecimal redondeado al centésimo más cercano.
        Por ejemplo, 4.2545 debería devolver 4.25.
        */

        BigDecimal bd = new BigDecimal("4.2545");
        double test1 = round(bd);
        System.out.println(bd + " redondeado al centésimo más cercano es: " + test1);

        System.out.println("----------------------------------------------------------------------------");

        /*
        2. Usando la documentación de BigDecimal, crea un método que acepte un BigDecimal, invierte el signo
        (si el parámetro es positivo, el resultado debería ser negativo y viceversa),
        redondea el número a la décima más cercana y devuelva el resultado.
        Por ejemplo, 1.2345 debería devolver -1.2 y -45.67 debería devolver 45.7.
        */

        BigDecimal num1 = new BigDecimal("1.2345");
        BigDecimal num2 = new BigDecimal("-45.67");

        double test2 = invertAndRound(num1);
        double test3 = invertAndRound(num2);

        System.out.println(num1 + " con signo invertido y redondeado es: " + test2);
        System.out.println(num2 + " con signo invertido y redondeado es: " + test3);

        System.out.println("----------------------------------------------------------------------------");

        /*
        Sistema de inventario de automóviles

        1. Supongamos que estás construyendo un sistema de inventario de automóviles. Todos los automóviles tienen un
        vinNumber, make, model y mileage. Pero ningún automóvil es solo un automóvil cualquiera. Cada automóvil
        puede ser un Sedan, un UtilityVehicle o un Truck.

        2. Crea una clase abstracta llamada Car y define las siguientes propiedades y comportamientos:
        - vinNumber: una String que representa el número de VIN del automóvil
        - make: una String que representa la marca del automóvil
        - model: una String que representa el modelo del automóvil
        - mileage: un int que representa el kilometraje del automóvil
        - getInfo(): un método que devuelve una String que contiene todas las propiedades del automóvil en un formato
        legible

        3. Crea tres clases que extiendan Car: Sedan, UtilityVehicle y Truck.

        4. Los objetos de UtilityVehicle deben tener una propiedad adicional fourWheelDrive, un boolean que representa
        si el vehículo tiene tracción en las cuatro ruedas.

        5. Los objetos de Truck deben tener una propiedad adicional towingCapacity, un double que representa la
        capacidad de remolque del camión.
        */

        Sedan sedan = new Sedan("123456", "Toyota", "Camry", 5000);
        System.out.println(sedan.getInfo());

        UtilityVehicle utilityVehicle = new UtilityVehicle("789012", "Jeep", "Wrangler", 10000, true);
        System.out.println(utilityVehicle.getInfo());

        Truck truck = new Truck("345678", "Ford", "F-150", 20000, 15000.00);
        System.out.println(truck.getInfo());

        System.out.println("----------------------------------------------------------------------------");

        /*
        Servicio de transmisión de vídeo

        1. Supón que está construyendo un servicio de transmisión de vídeo. Todos los videos son series de televisión
        o películas.

        2. Crea una clase abstracta llamada Video y define las siguientes propiedades y comportamientos:
        - title: un String que representa el título del video
        - duration: un int que representa la duración del video en minutos
        - getInfo(): un método que devuelve un String que contiene todas las propiedades del video en un formato legible

        3. Crea dos clases que extiendan Video: TvSeries y Movie.

        4. Los objetos TvSeries deben tener una propiedad adicional episodes, un int que representa el número de
        episodios en la serie.

        5. Los objetos Movie deben tener una propiedad adicional rating, un double que representa la calificación de la
        película.
        */

        TvSeries tvSeries = new TvSeries("TBBT", 30, 279);
        System.out.println(tvSeries.getInfo());

        Movie movie = new Movie("Avatar", 162, 4.6);
        System.out.println(movie.getInfo());

        System.out.println("----------------------------------------------------------------------------");


        /*
        Interfaz IntList

        1. Crea una interfaz IntList con los siguientes métodos:
         - add (int number): un método que agrega un nuevo número a la lista
         - get (int id): un método que recupera un elemento por su ID
        2. Crea dos implementaciones de IntList: IntArrayList y IntVector.
        3. IntArrayList debe almacenar números en un array con una longitud de 10 por defecto. Cuando se llama al
        método add, primero debes determinar si el array está lleno. Si lo está, crea un nuevo array que sea el 50%
        más grande, mueve todos los elementos al nuevo array y agregue el nuevo elemento.
        (Por ejemplo, un array de longitud 10 aumentaría a 15).
        4. IntVector debe almacenar números en un arreglo con una longitud de 20 por defecto. Cuando se llama al
        método add, primero debes determinar si el array está lleno. Si lo está, crea un nuevo array que sea el
        doble del tamaño del array actual, mueve todos los elementos al nuevo array y agrega el nuevo elemento.
        (Por ejemplo, un array de longitud 10 aumentaría a 20).

        En su README.md, incluye un ejemplo de cuándo IntArrayList sería más eficiente y cuándo IntVector sería más
        eficiente.
        */

        IntArrayList list1 = new IntArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        list1.add(16);
        list1.add(17);
        list1.add(18);
        System.out.println("El tamaño del array es: " + list1.getSizeArray());
        list1.add(19);
        System.out.println(list1.get(5)); // Salida: 14
        System.out.println("El tamaño del array es: " + list1.getSizeArray());
        System.out.println(list1.get(10)); // Salida: 19

        IntVector list2 = new IntVector();
        list2.add(15);
        list2.add(20);
        System.out.println(list2.get(1)); // Salida: 20


    }

    public static double invertAndRound(BigDecimal number){
        BigDecimal result = number.negate().setScale(1,number.ROUND_HALF_UP);
        return result.doubleValue();
    }

    public static double round(BigDecimal number){
        BigDecimal rounded = number.setScale(2, number.ROUND_HALF_UP);
        return rounded.doubleValue();
    }
}