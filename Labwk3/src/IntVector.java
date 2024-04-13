public class IntVector implements  IntList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 20;

    public void intVector() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;

    }
@Override
    public void add (int number) {
    if (size == array.length) {
        int newSize = array.length * 2;

        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, size); System.arraycopy(array, 0, newArray, 0, size);

        array = newArray;


    }
    array[size++] = number;
}
@Override

public int get(int id) {
        if(id < 0 || id >= size){
            throw new IndexOutOfBoundsException("Index Out of bounds");

        }
        return array[id];

}


}
