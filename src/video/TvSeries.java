package video;

public class TvSeries extends Video{
    public int episodes;

    public TvSeries(String title, int duration, int episodes){
        super(title, duration);
        this.episodes = episodes;
    }

    public int getEpisodes(){
        return this.episodes;
    }

    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }

    @Override
    public void getInfo(){
        System.out.println("TvSeries --> " + getTitle()
                + ", con duración de " + getDuration() + " minutos. "
                + "Número de episodios: " + getEpisodes());
    }
}
