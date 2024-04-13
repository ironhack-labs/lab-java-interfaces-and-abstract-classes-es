package Videos;

public class Movie extends Video{
    private double rating; // representa la calificación de la película.

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return "TvSeries {" +
                "title='" + getTitle() + '\'' +
                ", duration=" + getDuration() + + '\'' +
                ", rating='" + rating +
                '}';
    }
}
