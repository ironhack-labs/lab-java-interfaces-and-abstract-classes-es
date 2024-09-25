import java.util.Arrays;

public class IntVector implements IntList {
    private int[] array;
    private int size;

    public IntVector() {
        this.array = new int[20];
        this.size = 0;
    }

    @Override
    public void add(int number) {

        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
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
