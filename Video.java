// Abstract class Video
abstract class Video {
    String title;
    int duration;

    public Video(String title, int duration) { // Constructor
        this.title = title;
        this.duration = duration;
    }

    public abstract String getInfo(); // Abstract method to retrieve video information
}
