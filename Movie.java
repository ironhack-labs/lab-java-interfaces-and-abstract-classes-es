
// Class Movie that extends Video
class Movie extends Video {
    double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration); // Calling parent constructor
        this.rating = rating;
    }

    @Override
    public String getInfo() { // Overriding the abstract method
        return "Title: " + title + "\nDuration: " + duration + " minutes\nRating: " + rating;
    }
}
