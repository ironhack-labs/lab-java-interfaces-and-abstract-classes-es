public class Movie extends Video {
    private double rating;

    public Movie (String title, int duration,double rating){
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo(){
        return "The " + getTitle() + " movie has a duration of " + getDuration() + " minutes and is rated as " + rating;
    }
}
