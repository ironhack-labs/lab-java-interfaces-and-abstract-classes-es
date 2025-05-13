package ejercicio3;

public class Main {
    public static void main(String[] args) {

        TvSeries serie1 = new TvSeries("Stranger Things", 50, 25);
        Movie pelicula1 = new Movie("Inception", 148, 8.7);

        TvSeries serie2 = new TvSeries("You", 50, 40);
        Movie pelicula2 = new Movie("Apolo 13", 140, 7.7);

        System.out.println("Información del contenido:");
        System.out.println(serie1.getInfo());
        System.out.println(pelicula1.getInfo());
        System.out.println(serie2.getInfo());
        System.out.println(pelicula2.getInfo());

    }
}