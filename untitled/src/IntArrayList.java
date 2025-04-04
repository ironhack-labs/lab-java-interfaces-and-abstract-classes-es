public class IntArrayList implements InList {
    private int[] array;
    private int size;

    public IntArrayList() {
        array = new int[10];
        size = 0;
    }

    private void resizeArray() {
        int newSize = array.length + (array.length / 2); // Increase the 50%
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
        System.out.println("IntArrayList resized! New array size: " + newSize);

    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            resizeArray();
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id >= 0 && id < size) {
            return array[id];
        } else {  //as we need to return an int, we need exception
            throw new IndexOutOfBoundsException("Index out of range");
        }

    }

}

