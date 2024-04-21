package Transmisión;

public class TvSeries extends Video {
    public final int episodes = 30; // lo he hecho final solo para practicar esta funcion.
    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
    }
    public int getEpisodes(){
        return episodes;
    }

    @Override
    public String getInfo() {
        return "Title" + getTitle() + "Duration" + getDuration() + "Episodes" + episodes;
    }

}
