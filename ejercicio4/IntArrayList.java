package ejercicio4;

public class IntArrayList implements IntList {
    private int[] data;
    private int size;

    //constructor
    public IntArrayList() {
        data = new int[10];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == data.length) {
            int newCapacidad = data.length + data.length / 2;
            int[] newData = new int[newCapacidad];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("ID fuera de rango");
        }
        return data[id];
    }
}
