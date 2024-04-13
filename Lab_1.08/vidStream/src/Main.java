public class Main {
    public static void main(String[] args) {
        TvSeries tvSeries = new TvSeries("Breaking Bad", 45, 62);
        Movies movie = new Movies("Inception", 148, 8.8);

        System.out.println(tvSeries.getInfo());
        System.out.println(movie.getInfo());
    }
}