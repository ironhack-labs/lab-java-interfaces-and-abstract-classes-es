package ejercicio4;

public class IntVector implements IntList {
    private int[] data;
    private int size;

    public IntVector() {
        data = new int[20];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == data.length) {
            int newCapacidad = data.length * 2;  // Doble tamaño
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
