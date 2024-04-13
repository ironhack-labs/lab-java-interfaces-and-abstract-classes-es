public class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodes){
        super(title, duration);
        this.episodes = episodes;
    }


    public int getEpisodes() {
        return episodes;
    }
    @Override
    public String getInfo() {
        return "TV Series: " + getTitle() + ", Duration: " + getDuration() + " minutes, Episodes: " + episodes;
    }

}
