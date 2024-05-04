package Interfaces;

public class IntVector implements IntList{

    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 20;

    public IntVector() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2]; // Duplica el tamaño
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = number;
    }

    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + id);
        }
        return array[id];
    }
}
