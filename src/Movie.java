public class Movie {
    String title;
    String genre;
    String showtime;

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

    public void showObjectCreated() {
        System.out.println("A Movie object has been created.");
    }
}
