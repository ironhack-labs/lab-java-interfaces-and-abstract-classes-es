package org.alvarowau.exercise3.model;

public final class Movie extends Video {

    private double rating;

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
        return String.format("MOVIE\nTítulo: %s\nDuración: %d min\nCalificación: %.1f",
                getTitle(), getDuration(), rating);
    }
}
