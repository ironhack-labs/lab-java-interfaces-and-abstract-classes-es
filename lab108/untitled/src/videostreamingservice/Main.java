package videostreamingservice;

public class Main {
    public static void main(String[] args) {
        Video movie = new Movie("The Princess Bride", 98, 9.8);
        Video tvSeries = new TvSeries("Curb Your Enthusiasm", 32, 120);

        System.out.println(movie.getInfo());

        System.out.println(tvSeries.getInfo());


        System.out.println("Both masterpieces, worth a watch.... or 17");
    }
}
