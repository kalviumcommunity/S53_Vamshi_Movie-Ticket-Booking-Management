public class App {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];

        movies[0] = new Movie();
        movies[0].setDetails("Inception", "Sci-Fi", "7:00 PM");

        movies[1] = new Movie();
        movies[1].setDetails("Titanic", "Romance", "9:00 PM");

        movies[2] = new Movie();
        movies[2].setDetails("Avatar", "Fantasy", "5:00 PM");

        System.out.println("\nAvailable Movies:");
        for (Movie movie : movies) {
            movie.displayDetails();
            System.out.println();
        }

        Booking booking = new Booking();
        
        booking.bookTicket(movies[1], 4);

        System.out.println("\nYour Booking:");
        booking.displayBookingDetails();
    }
}
