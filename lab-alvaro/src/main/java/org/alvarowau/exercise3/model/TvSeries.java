package org.alvarowau.exercise3.model;

public final class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodies) {
        super(title, duration);
        this.episodes = episodies;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodies) {
        this.episodes = episodies;
    }

    @Override
    public String getInfo() {
        return String.format("TV SERIES\nTítulo: %s\nDuración: %d min\nEpisodios: %d",
                getTitle(), getDuration(), episodes);
    }
}
