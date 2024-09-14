import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

class BigDecimalOperations {

    public static double roundToHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double invertSignAndRound(BigDecimal number) {
        BigDecimal inverted = number.negate();
        return inverted.setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}

abstract class Car {
    protected String vinNumber;
    protected String make;
    protected String model;
    protected int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public abstract String getInfo();
}

class Sedan extends Car {
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        return String.format("Sedan [VIN: %s, Make: %s, Model: %s, Mileage: %d]", vinNumber, make, model, mileage);
    }
}

class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return String.format("UtilityVehicle [VIN: %s, Make: %s, Model: %s, Mileage: %d, FourWheelDrive: %b]", vinNumber, make, model, mileage, fourWheelDrive);
    }
}

class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return String.format("Truck [VIN: %s, Make: %s, Model: %s, Mileage: %d, TowingCapacity: %.2f]", vinNumber, make, model, mileage, towingCapacity);
    }
}

abstract class Video {
    protected String title;
    protected int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public abstract String getInfo();
}

class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return String.format("TvSeries [Title: %s, Duration: %d minutes, Episodes: %d]", title, duration, episodes);
    }
}

class Movie extends Video {
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return String.format("Movie [Title: %s, Duration: %d minutes, Rating: %.1f]", title, duration, rating);
    }
}

interface IntList {
    void add(int number);
    int get(int id);
}

class IntArrayList implements IntList {
    private int[] array;
    private int size;

    public IntArrayList() {
        array = new int[10];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int newSize = (int) (array.length * 1.5);
            int[] newArray = new int[newSize];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[id];
    }
}

class IntVector implements IntList {
    private List<Integer> list;

    public IntVector() {
        list = new ArrayList<>(20);
    }

    @Override
    public void add(int number) {
        list.add(number);
        if (list.size() == list.size()) {
            int newSize = list.size() * 2;
            List<Integer> newList = new ArrayList<>(newSize);
            newList.addAll(list);
            list = newList;
        }
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= list.size()) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(id);
    }
}

public class Main {
    public static void main(String[] args) {
        BigDecimal num = new BigDecimal("4.2545");
        System.out.println("Round to Hundredth: " + BigDecimalOperations.roundToHundredth(num));

        num = new BigDecimal("1.2345");
        System.out.println("Invert Sign and Round: " + BigDecimalOperations.invertSignAndRound(num));

        Car sedan = new Sedan("1HGBH41JXMN109186", "Honda", "Civic", 12000);
        Car utilityVehicle = new UtilityVehicle("1FTRW08L96KC85929", "Ford", "Explorer", 45000, true);
        Car truck = new Truck("1GT12UEY1EZ351938", "Chevrolet", "Silverado", 80000, 9500);

        System.out.println(sedan.getInfo());
        System.out.println(utilityVehicle.getInfo());
        System.out.println(truck.getInfo());

        Video tvSeries = new TvSeries("Breaking Bad", 45, 62);
        Video movie = new Movie("Inception", 148, 8.8);

        System.out.println(tvSeries.getInfo());
        System.out.println(movie.getInfo());

        IntList arrayList = new IntArrayList();
        IntList vectorList = new IntVector();

        for (int i = 0; i < 12; i++) {
            arrayList.add(i);
            vectorList.add(i);
        }

        for (int i = 0; i < 12; i++) {
            System.out.println("ArrayList get(" + i + "): " + arrayList.get(i));
            System.out.println("VectorList get(" + i + "): " + vectorList.get(i));
        }
    }
}