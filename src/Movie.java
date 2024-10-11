public class Movie {
    String title;
    String genre;
    String showtime;
    static int movieCount = 0;  // Static variable to track the number of movies created

    public Movie() {
        movieCount++;  // Increment movie count when a new movie is created
    }

    public void setDetails(String title, String genre, String showtime) {
        this.title = title;
        this.genre = genre;
        this.showtime = showtime;
    }

    public void displayDetails() {
        System.out.println("Movie Title: " + this.title);
        System.out.println("Genre: " + this.genre);
        System.out.println("Showtime: " + this.showtime);
    }

    // Static member function to get total movie count
    public static int getTotalMovies() {
        return movieCount;  // Accessing the static variable movieCount
    }
}
