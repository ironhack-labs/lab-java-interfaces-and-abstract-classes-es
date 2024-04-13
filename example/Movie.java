package org.example;

public class Movie extends Video {
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return String.format("Movie: %s - Rating: %.1f, Duration: %d minutes",
                getTitle(), rating, getDuration());
    }

    public double getRating() {
        return rating;
    }
}
