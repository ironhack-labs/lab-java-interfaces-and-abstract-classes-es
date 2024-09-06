package org.alvarowau.exercise3;

import org.alvarowau.exercise3.model.Movie;
import org.alvarowau.exercise3.model.TvSeries;

public class Exercise3 {

    public static void start() {
        // Crear un objeto Movie
        Movie movie = new Movie("Inception", 148, 8.8);

        // Crear un objeto TvSeries
        TvSeries tvSeries = new TvSeries("Breaking Bad", 60 * 62, 62); // Total de duración = 60 min/episodio * 62 episodios


        System.out.println("Información de la Película:");
        System.out.println(movie.getInfo());

        System.out.println("\nInformación de la Serie de Televisión:");
        System.out.println(tvSeries.getInfo());
    }

    public static void main(String[] args) {
        start();
    }
}