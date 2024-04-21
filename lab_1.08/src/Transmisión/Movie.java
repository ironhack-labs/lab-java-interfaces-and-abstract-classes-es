package Transmisión;

public class Movie extends Video{
    private final double rating = 3.5;
    public Movie(String title, int duration, double rating) {
        super(title, duration);
    }

    public double getRating() {
        return rating;
    }
    public String getInfo() {
        return "Title" + getTitle() + "Duration" + getDuration() + "rating" + rating;
    }
}
