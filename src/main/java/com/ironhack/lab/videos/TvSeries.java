package com.ironhack.lab.videos;

/**
 * A TV series, which additionally records how many episodes it has.
 *
 * <p>The inherited duration is the running time of a single episode.</p>
 */
public class TvSeries extends Video {

    /** Number of episodes in the series. */
    private int episodes;

    /**
     * Creates a TV series.
     *
     * @param title    the title of the series
     * @param duration the duration of one episode, in minutes
     * @param episodes the number of episodes
     */
    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Type: TV series | Episodes: " + episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
