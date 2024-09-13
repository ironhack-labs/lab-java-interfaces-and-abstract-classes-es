package org.example.classes;

import org.example.classes.Abstract.Video;

public class Movie extends Video {
    private double rating;


    public Movie(String title, int duration) {
        super(title, duration);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}




