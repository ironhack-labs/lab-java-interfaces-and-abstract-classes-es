package InterfazIntList;

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

            int newSize = array.length + array.length / 2;
            int[] newArray = new int[newSize];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id >= 0 && id < size) {
            return array[id];
        }
        throw new IndexOutOfBoundsException("ID fuera de rango");
    }
}
