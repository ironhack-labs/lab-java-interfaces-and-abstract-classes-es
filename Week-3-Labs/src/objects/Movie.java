package objects;

public class Movie extends Video {
  protected double rating;

  public Movie(String title, int duration, double rating) {
    super(title, duration);
    this.rating = rating;
  }

  @Override
  public void getInfo() {
    System.out.println("Movie{" + "rating=" + rating + ", title='" + title + '\'' + ", duration=" + duration + '}');
  }
}
