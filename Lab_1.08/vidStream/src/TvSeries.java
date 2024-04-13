class TvSeries extends Video{

    int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;

    }

    public String getInfo(){
        return super.getInfo() + ", Episodes: " + episodes;
    }
}
