
// EJERCICIO 1 -------------------------------------

import java.math.BigDecimal;
import java.math.RoundingMode;
public class BigDecimalUtils {

    public static BigDecimal invertSignAndRoundToNearestTenth(BigDecimal number) {
        BigDecimal inverted = number.negate();
        BigDecimal rounded = inverted.setScale(1, RoundingMode.HALF_UP);

        return rounded;
    }
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("1.2345");
        BigDecimal num2 = new BigDecimal("-45.67");

        BigDecimal result1 = invertSignAndRoundToNearestTenth(num1);
        BigDecimal result2 = invertSignAndRoundToNearestTenth(num2);

        System.out.println("(1.2345): " + result1);
        System.out.println("(-45.67): " + result2);
    }
}


import java.math.BigDecimal;
import  java.math.RoundingMode;

public class BigDecimalUtils {

    public static double roundToNearestHundredth(BigDecimal number) {
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal num = new BigDecimal("4.2545");
        double result = roundToNearestHundredth(num);
        System.out.println(result);
    }
}


// EJERCICIO 2 -------------------------------------------


public abstract class Car {

    private String make;
    private String model;
    private int mileage;
    private String vinNumber;

    public Car(String make, int mileage, String model) {
        this.make = make;
        this.mileage = mileage;
        this.model = model;
    }

    public Car(String vinNumber, String make, String model, int mileage) {

    }

    public String getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public abstract String getAdditionalInfo();

    public String getInfo() {
        return "VIN: " + vinNumber + "\n" +
                "Marca: " + make + "\n" +
                "Modelo: " + model + "\n" +
                "Kilometraje: " + mileage + "km\n" +
                getAdditionalInfo();

    }
}


//------------------------------------------------------------------

public class Sedan extends Car {

    public Sedan(String vinNumber, String make, String model, int mileage) {

        super(vinNumber, mileage, model);
    }


    public String getAdditionalInfo() {
        return "Tipo: Sedan";
    }
}


// --------------------------------------------------------------------

public class Truck extends Car {
    private double towingCapacity;


    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber,make,model, mileage);
        this.towingCapacity = towingCapacity;
    }
    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public String getAdditionalInfo(){
        return "Tipo: Truck\n" +
                "Capacidad del remolque: " + towingCapacity + " kg ";

    }
}


//---------------------------------------------------------------------

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;


    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public String getAdditionalInfo() {
        return "Tipo: Utility Vehicle\n" +
                "Traccion en las cuatro ruedas: " + (fourWheelDrive ? "Si" : "No");
    }
}


//--------------------------------------------------------------

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("1HGBH41JXMN109186", "Toyota", "Camry", 50000);
        UtilityVehicle suv = new UtilityVehicle("2HGCM82633A123456", "Honda", "CR-V", 30000, true);
        Truck truck = new Truck("1FTFW1EF5EKE47198", "Ford", "F-150", 25000, 5000.0);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());
    }
}


//EJERCICIO 3 -------------------------------------------------------


public abstract class Video {
    private String title;
    private int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
    public abstract String getAdditionalInfo();
    public String getInfo() {
        return "Título: " + title + "\n" +
                "Duración: " + duration + " minutos\n" +
                getAdditionalInfo();
    }
}


//--------------------------------------------------------------


public class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getAdditionalInfo() {
        return "Episodios: " + episodes;
    }
}


//----------------------------------------------------------

public class Movie extends Video {
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public String getAdditionalInfo() {
        return "Calificación: " + rating;
    }
}

//-------------------------------------------------

public class Main {
    public static void main(String[] args) {
        TvSeries tvSeries = new TvSeries("Breaking Bad", 3000, 62);
        Movie movie = new Movie("Inception", 148, 8.8);

        System.out.println(tvSeries.getInfo());
        System.out.println(movie.getInfo());
    }
}

//EJERCICIO 4 -------------------------------------------------------

public interface IntList{
    void add(int number);
    int get(int index);
}

//----------------------------------------------------------------

public class IntArrayList  implements IntList {
    private int[] array;
    private int size;

    public IntArrayList(){
        array = new int[10];
        size = 0;
    }

    public void add(int number) {
        if (size == array.length) {
            int newLegth = array.length + (array.length / 2);
            int[] newArray = new int[newLegth];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }

        array[size] = number;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indice fuera de rango: " + index);
        }

        return array[index];

    }

}

public int size() {
    return size;
}
}

//----------------------------------------------------


public class Main {
    public static void main(String[] args) {
        IntList arrayList = new IntArrayList();
        IntList vector = new IntVector();
        for (int i = 0; i < 15; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < 25; i++) {
            vector.add(i);
        }

        System.out.println("Elementos de IntArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        System.out.println("Elementos de IntVector:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }
        System.out.println();
    }
}

