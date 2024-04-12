package org.example;

public class Main {
    public static void main(String[] args) {
        TvSeries breakingBad = new TvSeries("Breaking Bad", 45, 62);
        Movie inception = new Movie("Inception", 148, 8.8);

        // Obtener información de cada video
        System.out.println(breakingBad.getInfo());
        System.out.println(inception.getInfo());
    }
}