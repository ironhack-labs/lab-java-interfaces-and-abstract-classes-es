package video;

public class Movie extends Video{
    private double rating;

    public Movie(String title, int duration, double rating){
        super(title, duration);
        this.rating = rating;
    }

    public double getRating(){
        return this.rating;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    @Override
    public void getInfo(){
        System.out.println("Movie --> " + getTitle()
                + ", con duración de " + getDuration() + " minutos. "
                + "Puntuación: " + getRating());
    }
}
