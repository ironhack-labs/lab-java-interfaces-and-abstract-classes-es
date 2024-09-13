package org.example.classes;

import org.example.classes.Abstract.Video;

public class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration) {
        super(title, duration);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
