package Interfaz;

import java.util.Arrays;

public class IntArrayList implements IntList{
    private int arraySize = 6;
    private int index = 0;

    private int[] numbers = new int[arraySize];

    public IntArrayList() {
        //this.numbers = numbers;
    }


    @Override
    public void add(int number) {

        if (index < arraySize) {
            numbers[index] = number;
            index++;
            System.out.println("IntArrayList: " + Arrays.toString(numbers));
        } else {
            arraySize = arraySize * 2;
            int[] numbers2 = new int[arraySize];
            System.arraycopy(numbers, 0, numbers2, 0, numbers.length);
            numbers = numbers2;
            System.out.println("IntArrayList: Nuevo tamaño del array: " + arraySize);

        }
    }

    @Override
    public void get(int id) {
        System.out.println("IntArrayList: El elemento solicitado es: "+numbers[id]);

    }

}

