public class IntVector implements InList{
    private int[] array;
    private int size;

    public IntVector() {
        array = new int[20];
        size = 0;
    }

    private void resizeArray() {
        int newSize = array.length * 2; // Double the size
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
        System.out.println("InVector resized! New array size: " + newSize);
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
        } else {  //as we need to return an int, we need excpetion
            throw new IndexOutOfBoundsException("Index out of range");
        }

    }


}
