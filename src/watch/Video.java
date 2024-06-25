package watch;

public abstract class Video {

    protected String title;

    protected int duration;

    public String getInfoVideo() {
        return String.format("Video{ title= %s, duration= %s}", title, duration);
    }

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }


}
