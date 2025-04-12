package transmisionVideo;

public class Main {

    public static void main (String[] args){

        Video series1 = new TvSeries("Los Simpsons", 22, 1500);
        Video series2 = new TvSeries("Common Side Effects", 20, 10);
        Video series3 = new TvSeries("The Office", 40, 180);


        Video movie1 = new Movie("Interstellar", 151, 9.9);
        Video movie2 = new Movie("ET", 115, 8.2);
        Video movie3 = new Movie("Shrek", 121, 9.8);


        System.out.println(series1.getInfo());
        System.out.println(series2.getInfo());
        System.out.println(series3.getInfo());

        System.out.println(movie1.getInfo());
        System.out.println(movie2.getInfo());
        System.out.println(movie3.getInfo());

    }

}
