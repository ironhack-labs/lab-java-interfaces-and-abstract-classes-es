package com.ironhack.lab.videos;

import java.util.Locale;

/**
 * A movie, which additionally records its audience rating.
 */
public class Movie extends Video {

    /** Audience rating of the movie, on a 0 to 10 scale. */
    private double rating;

    /**
     * Creates a movie.
     *
     * @param title    the title of the movie
     * @param duration the duration in minutes
     * @param rating   the rating, on a 0 to 10 scale
     */
    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The rating is formatted with {@link Locale#US} so the decimal
     * separator does not change with the machine's locale.</p>
     */
    @Override
    public String getInfo() {
        return super.getInfo()
                + String.format(Locale.US, " | Type: Movie | Rating: %.1f/10", rating);
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
