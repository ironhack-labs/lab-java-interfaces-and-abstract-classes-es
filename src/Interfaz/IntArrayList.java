package Interfaz;

import java.util.Arrays;

public class IntArrayList implements IntList{
    int arraySize = 10;
    private int[] numbers = new int[arraySize];

    public IntArrayList() {
        //this.numbers = numbers;
    }

    @Override
    public void add(int number) {

        while(numbers.length <= arraySize){
            numbers[numbers.length-1] = number;
            System.out.println(Arrays.toString(numbers));
        }
        int[] numbers2 = new int[arraySize];
        arraySize = arraySize+arraySize/2;
        System.arraycopy(numbers, 0, numbers2, 0, numbers.length);
        System.out.println("El nuevo array numbers es: ");
        System.out.println(Arrays.toString(numbers2));
        System.out.println("Y su nuevo tamaño es: "+ arraySize);
        numbers = numbers2;
        }
    @Override
    public void get(int id) {
        System.out.println("El elemento solicitado es: "+numbers[id]);

    }

}

