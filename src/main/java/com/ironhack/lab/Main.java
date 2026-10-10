package com.ironhack.lab;

import com.ironhack.lab.bigdecimal.BigDecimalOperations;
import com.ironhack.lab.cars.Car;
import com.ironhack.lab.cars.Sedan;
import com.ironhack.lab.cars.Truck;
import com.ironhack.lab.cars.UtilityVehicle;
import com.ironhack.lab.intlist.IntArrayList;
import com.ironhack.lab.intlist.IntList;
import com.ironhack.lab.intlist.IntVector;
import com.ironhack.lab.videos.Movie;
import com.ironhack.lab.videos.TvSeries;
import com.ironhack.lab.videos.Video;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.function.IntSupplier;

/**
 * Runs every exercise of the lab and prints the results, so the whole
 * solution can be checked by running a single class.
 */
public class Main {

    public static void main(String[] args) {
        demonstrateBigDecimalOperations();
        demonstrateCarInventory();
        demonstrateVideoCatalogue();
        demonstrateIntLists();
    }

    /** Exercise 1: the two {@link BigDecimalOperations} rounding helpers. */
    private static void demonstrateBigDecimalOperations() {
        System.out.println("=== 1. BigDecimal operations ===");

        // Every value comes from a String literal, never from a double, so the
        // decimal digits are exactly what they look like.
        printRoundToHundredth(new BigDecimal("4.2545"));
        printRoundToHundredth(new BigDecimal("4.2555"));
        printRoundToHundredth(new BigDecimal("-7.005"));

        printReverseSignAndRoundToTenth(new BigDecimal("1.2345"));
        printReverseSignAndRoundToTenth(new BigDecimal("-45.67"));

        try {
            BigDecimalOperations.roundToHundredth(null);
        } catch (NullPointerException e) {
            System.out.println("roundToHundredth(null) rejected: " + e.getMessage());
        }

        System.out.println();
    }

    private static void printRoundToHundredth(BigDecimal value) {
        double rounded = BigDecimalOperations.roundToHundredth(value);
        System.out.printf(Locale.US, "roundToHundredth(%s) = %s%n", value, rounded);
    }

    private static void printReverseSignAndRoundToTenth(BigDecimal value) {
        BigDecimal result = BigDecimalOperations.reverseSignAndRoundToTenth(value);
        System.out.printf(Locale.US, "reverseSignAndRoundToTenth(%s) = %s%n", value, result);
    }

    /** Exercise 2: the abstract {@link Car} hierarchy. */
    private static void demonstrateCarInventory() {
        System.out.println("=== 2. Car inventory ===");

        // Held as Car, the abstract type, so getInfo() dispatches to each subclass.
        Car[] inventory = {
                new Sedan("1HGCM82633A004352", "Honda", "Accord", 48_250),
                new UtilityVehicle("5J6RW2H89KL012345", "Subaru", "Outback", 31_900, true),
                new Truck("1FTFW1E58MKE12345", "Ford", "F-150", 12_400, 13_000.0)
        };

        for (Car car : inventory) {
            System.out.println(car.getInfo());
        }

        System.out.println();
    }

    /** Exercise 3: the abstract {@link Video} hierarchy. */
    private static void demonstrateVideoCatalogue() {
        System.out.println("=== 3. Video catalogue ===");

        Video[] catalogue = {
                new TvSeries("The Expanse", 55, 62),
                new Movie("Arrival", 116, 7.9)
        };

        for (Video video : catalogue) {
            System.out.println(video.getInfo());
        }

        System.out.println();
    }

    /** Exercise 4: the {@link IntList} interface and its two implementations. */
    private static void demonstrateIntLists() {
        System.out.println("=== 4. IntList implementations ===");

        IntArrayList arrayList = new IntArrayList();
        demonstrateGrowth("IntArrayList", arrayList, arrayList::size, arrayList::capacity, 21);

        IntVector vector = new IntVector();
        demonstrateGrowth("IntVector", vector, vector::size, vector::capacity, 21);
    }

    /**
     * Appends numbers to a list through the {@link IntList} interface, printing
     * the capacity every time the backing array grows, and then reads a few
     * elements back.
     *
     * <p>{@code size} and {@code capacity} arrive as method references because
     * they live on the implementations: the interface declares only
     * {@code add} and {@code get}, exactly as the exercise specifies.</p>
     *
     * @param name            the implementation name, for the printed output
     * @param list            the list to fill
     * @param size            reads the element count of {@code list}
     * @param capacity        reads the backing array length of {@code list}
     * @param elementsToAdd   how many numbers to append
     */
    private static void demonstrateGrowth(String name, IntList list, IntSupplier size,
                                          IntSupplier capacity, int elementsToAdd) {
        System.out.printf("%s: initial capacity %d%n", name, capacity.getAsInt());

        int previousCapacity = capacity.getAsInt();
        for (int i = 0; i < elementsToAdd; i++) {
            list.add(i * 10);
            int currentCapacity = capacity.getAsInt();
            if (currentCapacity != previousCapacity) {
                System.out.printf("  grew %d -> %d while adding element %d%n",
                        previousCapacity, currentCapacity, size.getAsInt());
                previousCapacity = currentCapacity;
            }
        }

        System.out.printf("%s: size %d, capacity %d%n", name, size.getAsInt(), capacity.getAsInt());
        System.out.printf("  get(0) = %d, get(10) = %d, get(%d) = %d%n",
                list.get(0), list.get(10), size.getAsInt() - 1, list.get(size.getAsInt() - 1));

        // Out-of-range ids are rejected, so the unused tail slots of the
        // backing array are never returned as if they were elements.
        printOutOfBounds(list, size.getAsInt());
        printOutOfBounds(list, -1);

        System.out.println();
    }

    private static void printOutOfBounds(IntList list, int id) {
        try {
            list.get(id);
            System.out.printf("  get(%d) unexpectedly returned a value%n", id);
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("  get(%d) rejected: %s%n", id, e.getMessage());
        }
    }
}
