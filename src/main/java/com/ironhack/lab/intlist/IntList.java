package com.ironhack.lab.intlist;

/**
 * A growable list of {@code int} values.
 *
 * <p>Implementations store the numbers in a plain {@code int[]} and replace
 * that array with a larger one when it fills up. {@link IntArrayList} and
 * {@link IntVector} differ only in their default capacity and in how much
 * they grow by.</p>
 */
public interface IntList {

    /**
     * Appends a number to the end of the list, growing the backing array
     * first if it is already full.
     *
     * @param number the number to add
     */
    void add(int number);

    /**
     * Retrieves the element stored at the given id.
     *
     * <p>Ids are zero-based positions, so the first number added has id
     * {@code 0} and the last has id {@code size - 1}. Only ids that were
     * actually filled by {@link #add(int)} are valid: the unused slots of the
     * backing array are never returned.</p>
     *
     * @param id the zero-based position of the element
     * @return the element stored at that position
     * @throws IndexOutOfBoundsException if {@code id} is outside
     *         {@code [0, size)}
     */
    int get(int id);
}
