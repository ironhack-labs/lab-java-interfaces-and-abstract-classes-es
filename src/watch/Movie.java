package watch;

public class Movie extends Video{

    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public String getInfoVideo() {
        return String.format("Video{ title= %s, duration= %s, rating= %s}", title, duration,rating);
    }

}
