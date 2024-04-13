package IntList;

import java.util.ArrayList;
import java.util.Arrays;

public class IntArrayList implements IntList{
    private int[] array;
    private int size;

    public IntArrayList() {
        this.array = new int[10];
        this.size = 0;
    }

    // un método que agrega un nuevo número a la lista
    @Override
    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[array.length + (array.length/2)];
            System.arraycopy(array, 0, newArray, 0, size);
            //int[] copyArray1 = Arrays.copyOf(array, size);
            array = newArray;
        }
        array[size++] = number;
    }

    // un método que recupera un elemento por su ID
    @Override
    public int get(int id) {
        return array[id];
    }

    public int getSize() {
        return size;
    }

    public int getSizeArray() {
        return array.length;
    }
}
