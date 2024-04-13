package Videos;

public class TvSeries extends Video{
    private int episodes; // representa el número de episodios en la serie.

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return "TvSeries {" +
                "title='" + getTitle() + '\'' +
                ", duration=" + getDuration() + + '\'' +
                ", episodes='" + episodes +
                '}';
    }
}
