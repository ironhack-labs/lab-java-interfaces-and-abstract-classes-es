public class MainMovie {
    public static void main(String[] args) {

        Video movie = new Movie("Inception", 148, 8.8);
        System.out.println(movie.getInfo());


        Video tvSeries = new TvSeries("Breaking Bad", 60 * 62, 62); // duración total en minutos
        System.out.println(tvSeries.getInfo());
    }
}
