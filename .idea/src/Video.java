public abstract class Video {
    protected String title;
    protected int duration; // Duración en minutos

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public abstract String getInfo();
}
