package Serviciodetransmisiondevideo;

public class Movie extends Video{
private int rating;

    public Movie(String title, int duration, int rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public void getInfo() {
        System.out.println("Nombre de la pelicula: "+ getTitle());
        System.out.println("la duracion es: "+ getDuration()+ " horas");
        System.out.println("y tiene "+rating+ " estrellas");
        System.out.println("============================================");

    }
}
