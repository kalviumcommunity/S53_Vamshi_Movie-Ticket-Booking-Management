public abstract class Movie {
    private String title;
    private String genre;
    private String showtime;
    private static int movieCount = 0;

    public Movie(String title, String genre, String showtime) {
        this.title = title;
        this.genre = genre;
        this.showtime = showtime;
        movieCount++;
    }

    public abstract void generateTicket();

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getShowtime() {
        return showtime;
    }

    public static int getTotalMovies() {
        return movieCount;
    }

    public void displayDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Showtime: " + showtime);
    }
}
