package Interfaz;

import java.util.Arrays;

public class IntVector implements IntList{
    private int arraySize = 5;
    private int[] numbers = new int[arraySize];
    private int index = 0;

    public IntVector() {
        //this.numbers = numbers;
    }

    @Override
    public void add(int number) {

        if (index >= arraySize){
            arraySize = arraySize * 2;
            int[] numbers2 = new int[arraySize];
            System.arraycopy(numbers, 0, numbers2, 0, numbers.length);
            numbers = numbers2;
            System.out.println("IntVector: Nuevo tamaño del array: " + arraySize);
        } else {
            numbers[index] = number;
            index++;
            System.out.println("IntVector: "+Arrays.toString(numbers));

        }
    }
    @Override
    public void get(int id) {
        System.out.println("IntVector: El elemento solicitado es: "+numbers[id]);

    }

}
