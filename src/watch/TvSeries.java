package watch;

public class TvSeries extends Video{

    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public String getInfoVideo() {
        return String.format("Video{ title= %s, duration= %s, episodes= %s}", title, duration, episodes);
    }


}
