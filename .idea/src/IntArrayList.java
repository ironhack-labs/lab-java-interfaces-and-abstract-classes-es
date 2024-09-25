import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] array;
    private int size;

    public IntArrayList() {
        this.array = new int[10];
        this.size = 0;
    }

    @Override
    public void add(int number) {

        if (size == array.length) {
            array = Arrays.copyOf(array, (int) (array.length * 1.5));
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id >= size || id < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[id];
    }
}
