public class intVector implements IntList {
    private int[] array;
    private int size;

    public intVector() {
        this.array = new int[20];
        this.size = 0;
    }

    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = number;
    }

    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + id);
        }
        return array[id];
    }
}
