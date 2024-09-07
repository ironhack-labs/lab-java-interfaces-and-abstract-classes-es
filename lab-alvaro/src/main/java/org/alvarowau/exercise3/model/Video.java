package org.alvarowau.exercise3.model;

public sealed abstract class Video permits TvSeries, Movie {

    private String title;
    private int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Devuelve una cadena con la información del Video.
     *
     * @return Información completa del video en formato de cadena.
     */
    public String getInfo() {
        return String.format("VIDEO\nTítulo: %s\nDuración: %d min",
                title, duration);
    }
}