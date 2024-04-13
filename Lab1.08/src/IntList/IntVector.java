package IntList;

public class IntVector implements IntList{
    private int[] array;
    private int size;

    public IntVector() {
        this.array = new int[20];
        this.size = 0;
    }

    // un método que agrega un nuevo número a la lista
    @Override
    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[array.length*2];
            System.arraycopy(array, 0, newArray, 0, size);
            //int[] copyArray1 = Arrays.copyOf(array, size);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        return array[id];
    }
}
