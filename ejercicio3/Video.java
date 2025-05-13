package ejercicio3;

public abstract class Video {
    protected String title;  //representa el título del video
    protected int duration;   //representa la duración del video en minutos

    //cosntructor
    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getInfo() {
        return "Title: " + title + ", Duration: " + duration + " min";
    }

}
