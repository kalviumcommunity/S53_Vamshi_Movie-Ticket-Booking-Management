public class App {
    public static void main(String[] args) {
        // Using Default Constructor
        Movie[] movies = new Movie[3];
        movies[0] = new Movie();
        movies[0].setDetails("Inception", "Sci-Fi", "7:00 PM");

        // Using Overloaded Constructor
        movies[1] = new Movie("Titanic", "Romance", "9:00 PM");

        // Using Overloaded Method
        movies[2] = new Movie();
        movies[2].setDetails("Avatar", "Fantasy");

        System.out.println("\nAvailable Movies:");
        for (Movie movie : movies) {
            movie.displayDetails();
            System.out.println();
        }

        System.out.println("Total Movies Created: " + Movie.getTotalMovies());
    }
}
