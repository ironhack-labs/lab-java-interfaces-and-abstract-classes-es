package lab.ejercicio.InterfazList;

import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] array;
    private int size;

    public IntArrayList() {
        array = new int[10];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length + array.length / 2);
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id >= 0 && id < size) {
            return array[id];
        }
        throw new IndexOutOfBoundsException("Index: " + id + ", Size: " + size);
    }
}
