package objects;

public class TvSeries extends Video {
  protected int episodes;

  public TvSeries(String title, int duration, int episodes) {
    super(title, duration);
    this.episodes = episodes;
  }

  @Override
  public void getInfo() {
    System.out.println("TvSeries{" + "episodes=" + episodes + ", title='" + title + '\'' + ", duration=" + duration + '}');
  }

}
