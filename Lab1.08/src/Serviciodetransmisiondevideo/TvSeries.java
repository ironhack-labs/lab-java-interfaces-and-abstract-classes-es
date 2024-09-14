package Serviciodetransmisiondevideo;

public class TvSeries extends Video{
private double episodes;

    public TvSeries(String title, int duration, double episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public void getInfo() {
        System.out.println("Nombre de la Serie: "+getTitle());
        System.out.println("la duracion es de: "+ getDuration()+ " temporadas");
        System.out.println("tiene: "+ episodes + " episodios por cada temporada");
        System.out.println("=======================================================");
    }
}
