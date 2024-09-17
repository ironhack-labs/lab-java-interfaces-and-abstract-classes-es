public class IntVector implements IntList {
    private int[] array;
    private int size;

    public IntVector() {
        array = new int[20]; // Tamaño inicial de 20
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            // Si está lleno, duplicamos el tamaño
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index fuera de rango");
        }
    }
}
