public class Movie {
    private String title;
    private String genre;
    private String showtime;
    private static int movieCount = 0;

    // Default constructor
    public Movie() {
        movieCount++;
    }

    // Parameterized constructor
    public Movie(String title, String genre, String showtime) {
        this.title = title;
        this.genre = genre;
        this.showtime = showtime;
        movieCount++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

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
