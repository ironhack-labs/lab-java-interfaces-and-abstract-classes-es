package org.alvarowau.exercise4;

import org.alvarowau.exercise4.model.IntArrayList;
import org.alvarowau.exercise4.model.IntVector;

public class Exercise4 {
    public static void start(){
        // Prueba con IntVector
        System.out.println("Prueba con IntVector:");
        IntVector vector = new IntVector();
        for (int i = 0; i < 25; i++) {
            vector.add(i);
        }

        // Imprimir los valores
        for (int i = 0; i < 25; i++) {
            vector.get(i);
        }

        // Prueba con IntArrayList
        System.out.println("\nPrueba con IntArrayList:");
        IntArrayList arrayList = new IntArrayList();
        for (int i = 0; i < 15; i++) {
            arrayList.add(i * 2);
        }

        // Imprimir los valores
        for (int i = 0; i < 15; i++) {
            arrayList.get(i);
        }

        // Prueba con índice fuera de rango
        System.out.println("\nPrueba con índice fuera de rango:");
        vector.get(100);
        arrayList.get(100);
    }
}
