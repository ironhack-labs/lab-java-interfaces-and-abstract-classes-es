package Videos;

abstract class Video {
    private String title; // representa el título del video
    private int duration; // representa la duración del video en minutos

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // método que devuelve un String que contiene todas las propiedades del video en un formato legible
    public abstract String getInfo();
}
