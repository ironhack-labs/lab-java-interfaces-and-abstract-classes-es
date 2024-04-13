
// Class TvSeries that extends Video
class TvSeries extends Video {
    int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration); // Calling parent constructor
        this.episodes = episodes;
    }

    @Override
    public String getInfo() { // Overriding the abstract method
        return "Title: " + title + "\nDuration: " + duration + " minutes\nEpisodes: " + episodes;
    }
}
