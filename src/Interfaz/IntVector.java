package Interfaz;

import java.util.Arrays;

public class IntVector implements IntList{
    int arraySize = 5;
    int[] numbers = new int[arraySize];
    int index = 0;

    public IntVector() {
        //this.numbers = numbers;
    }

    @Override
    public void add(int number) {

        if (index < arraySize){
            numbers[index] = number;
            index++;
            System.out.println(Arrays.toString(numbers));
        } else {
            arraySize = arraySize * 2;
            int[] numbers2 = new int[arraySize];
            System.arraycopy(numbers, 0, numbers2, 0, numbers.length);
            numbers = numbers2;
            System.out.println("Nuevo tamaño del array: " + arraySize);
            add(number);
            //System.out.println("El nuevo array numbers es: ");
            //System.out.println(Arrays.toString(numbers2));
        }
    }
    @Override
    public void get(int id) {
        System.out.println("El elemento solicitado es: "+numbers[id]);

    }

}
