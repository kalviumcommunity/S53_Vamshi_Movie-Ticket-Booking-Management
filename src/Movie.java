public class Movie {
    private String title;
    private String genre;
    private String showtime;
    private static int movieCount = 0;

    public Movie() {
        movieCount++;
    }

    // Accessor and Mutator for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Accessor and Mutator for genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Accessor and Mutator for showtime
    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public void setDetails(String title, String genre, String showtime) {
        setTitle(title);
        setGenre(genre);
        setShowtime(showtime);
    }

    public void displayDetails() {
        System.out.println("Movie Title: " + getTitle());
        System.out.println("Genre: " + getGenre());
        System.out.println("Showtime: " + getShowtime());
    }

    public static int getTotalMovies() {
        return movieCount;
    }
}
