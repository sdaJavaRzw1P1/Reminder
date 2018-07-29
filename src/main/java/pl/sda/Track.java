package pl.sda;

public class Track {
    String title;
    int rating;

    public Track(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Track" +
                "title: " + title +
                ", rating=" + rating;
    }
}
