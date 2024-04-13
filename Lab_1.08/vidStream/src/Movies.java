class Movies extends Video{
    double rating;

    public Movies(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }
    public String getInfo(){
        return super.getInfo() + ", Rating: " + rating;
    }
}
