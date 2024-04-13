// IntVector.java
// This class implements IntList using an array with a default length of 20.

package com.example.intlist;

public class IntVector implements IntList {
    // The array that stores the integers.
    private int[] array;

    // The number of integers in the array.
    private int count;

    // The constructor initializes the array with a default length of 20.
    public IntVector() {
        array = new int[20];
        count = 0;
    }

    // Adds a new integer to the array.
    @Override
    public void add(int number) {
        if (count == array.length) {
            // Double the size of the array.
            int newLength = array.length * 2;
            int[] newArray = new int[newLength];

            // Copy the elements from the old array to the new array.
            System.arraycopy(array, 0, newArray, 0, count);

            // Update the array reference.
            array = newArray;
        }

        // Add the new integer to the array.
        array[count] = number;
        count++;
    }

    // Gets an integer from the array by its ID.
    @Override
    public int get(int id) {
        if (id < 0 || id >= count) {
            throw new IndexOutOfBoundsException("ID out of bounds");
        }

        return array[id];
    }
}