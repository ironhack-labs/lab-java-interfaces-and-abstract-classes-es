package InterfazIntList;

public class IntVector implements IntList {
    private int[] array;
    private int size;

    public IntVector() {
        array = new int[20];
        size = 0;
    }


    @Override
    public void add(int number) {
        if (size == array.length) {
            int newSize = array.length * 2;
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