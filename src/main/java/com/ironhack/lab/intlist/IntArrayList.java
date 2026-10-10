package com.ironhack.lab.intlist;

/**
 * An {@link IntList} backed by an array that holds 10 numbers by default and
 * grows by 50% whenever it is full, so the default array goes 10 to 15, then
 * 15 to 22, and so on.
 *
 * <p>The 1.5x factor keeps the array close to the number of elements actually
 * stored, at the cost of reallocating more often than {@link IntVector}.
 * Appends are still amortised O(1).</p>
 *
 * <p>The growth step is {@code Math.max(oldLength + 1, oldLength + oldLength / 2)}.
 * The guard matters only at the edges: with a capacity of 0 or 1,
 * {@code oldLength + oldLength / 2} returns the current capacity, which would
 * leave no room for the new element and loop forever. For every capacity from
 * 2 upwards the documented 1.5x step is unchanged.</p>
 */
public class IntArrayList implements IntList {

    /** Capacity of the backing array when none is specified. */
    private static final int DEFAULT_CAPACITY = 10;

    /** Backing storage; only the first {@code size} slots hold elements. */
    private int[] elements;

    /** Number of elements added so far, always {@code <= elements.length}. */
    private int size;

    /**
     * Creates an empty list with the default capacity of 10.
     */
    public IntArrayList() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Creates an empty list with the given capacity.
     *
     * @param initialCapacity the initial length of the backing array
     * @throws IllegalArgumentException if {@code initialCapacity} is negative
     */
    public IntArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException(
                    "initialCapacity must not be negative: " + initialCapacity);
        }
        this.elements = new int[initialCapacity];
    }

    @Override
    public void add(int number) {
        if (size == elements.length) {
            grow();
        }
        elements[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException(
                    "Index " + id + " is out of bounds for list of size " + size);
        }
        return elements[id];
    }

    /**
     * Returns the number of elements in the list.
     *
     * @return the element count
     */
    public int size() {
        return size;
    }

    /**
     * Returns how many elements the backing array can hold before it has to
     * grow again. Exposed on the implementation rather than on
     * {@link IntList} so the interface stays as the exercise specifies it.
     *
     * @return the length of the backing array
     */
    public int capacity() {
        return elements.length;
    }

    /**
     * Replaces the backing array with one 50% larger and copies every element
     * across.
     */
    private void grow() {
        int oldLength = elements.length;
        int newLength = Math.max(oldLength + 1, oldLength + oldLength / 2);
        int[] grown = new int[newLength];
        System.arraycopy(elements, 0, grown, 0, oldLength);
        elements = grown;
    }
}
