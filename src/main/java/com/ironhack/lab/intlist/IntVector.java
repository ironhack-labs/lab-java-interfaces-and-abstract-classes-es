package com.ironhack.lab.intlist;

/**
 * An {@link IntList} backed by an array that holds 20 numbers by default and
 * doubles in size whenever it is full, so the default array goes 20 to 40,
 * then 40 to 80, and so on.
 *
 * <p>The 2x factor reallocates half as often as {@link IntArrayList} and
 * copies far fewer elements overall, at the cost of leaving more unused slots
 * right after a resize. Appends are amortised O(1).</p>
 *
 * <p>The growth step is {@code Math.max(oldLength + 1, oldLength * 2)}. The
 * guard matters only at a capacity of 0, where doubling would stay at 0 and
 * leave no room for the new element. For every capacity from 1 upwards the
 * documented 2x step is unchanged.</p>
 */
public class IntVector implements IntList {

    /** Capacity of the backing array when none is specified. */
    private static final int DEFAULT_CAPACITY = 20;

    /** Backing storage; only the first {@code size} slots hold elements. */
    private int[] elements;

    /** Number of elements added so far, always {@code <= elements.length}. */
    private int size;

    /**
     * Creates an empty vector with the default capacity of 20.
     */
    public IntVector() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Creates an empty vector with the given capacity.
     *
     * @param initialCapacity the initial length of the backing array
     * @throws IllegalArgumentException if {@code initialCapacity} is negative
     */
    public IntVector(int initialCapacity) {
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
                    "Index " + id + " is out of bounds for vector of size " + size);
        }
        return elements[id];
    }

    /**
     * Returns the number of elements in the vector.
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
     * Replaces the backing array with one twice as long and copies every
     * element across.
     */
    private void grow() {
        int oldLength = elements.length;
        int newLength = Math.max(oldLength + 1, oldLength * 2);
        int[] grown = new int[newLength];
        System.arraycopy(elements, 0, grown, 0, oldLength);
        elements = grown;
    }
}
