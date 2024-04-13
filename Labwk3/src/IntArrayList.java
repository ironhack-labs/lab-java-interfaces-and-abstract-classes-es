public class IntArrayList implements  IntList {
    private int[] array;
    private int size;
    private static final  int DEFAULT_CAPACITY = 10;

    public void intArrayList() {
        this.array = new int[DEFAULT_CAPACITY];
    }
    @Override
    public void add(int number) {
        if (size == array.length) {
            int newSize = (int) (array.length * 1.5);
            int[] newArray = new int[newSize];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[id];
    }
}

