package org.alvarowau.exercise4.model;

import org.alvarowau.exercise4.model.interfaces.IntList;

/**
 * IntVector debe almacenar números en un arreglo con una longitud de 20 por defecto. Cuando se llama al método add,
 * primero debes determinar si el array está lleno. Si lo está, crea un nuevo array que sea el doble del tamaño del
 * array actual, mueve todos los elementos al nuevo array y agrega el nuevo elemento. (Por ejemplo, un array de
 * longitud 10 aumentaría a 20).
 */
public class IntVector implements IntList {

    private int currentSize;
    private int sizeTotal = 10;
    private Integer[] array;

    public IntVector() {
        this.array = new Integer[sizeTotal];
        currentSize = 0;
    }

    @Override
    public void add(int number) {
        if(currentSize >= array.length){
            resizeArray();
        }
        array[currentSize++] = number;
    }

    private void resizeArray(){
        sizeTotal = array.length * 2;
        Integer[] newArray = new Integer[sizeTotal];
        System.arraycopy(array,0,newArray,0,array.length);
        array = newArray;
    }

    @Override
    public void get(int id) {
        if(id >= 0 && id < currentSize) {
            System.out.println("Valor en el índice " + id + ": " + array[id]);
        } else {
            System.out.println("Índice fuera de rango");
        }
    }
}
