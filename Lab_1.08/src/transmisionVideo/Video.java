package transmisionVideo;

public abstract class Video {
    private String title;
    private int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    public abstract String getInfo();

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}
