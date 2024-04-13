package Video;

public class Movie extends Video{
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return "Video.Video Category: Video.Movie\n"+
                super.getInfo()
                +"Rating: "+ rating+"\n";
    }
}
