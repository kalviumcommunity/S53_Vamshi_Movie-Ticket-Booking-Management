public class App {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];  // Array dynamically allocated

        movies[0] = new Movie();        // Object dynamically allocated using new
        movies[0].setDetails("Inception", "Sci-Fi", "7:00 PM");

        movies[1] = new Movie();        // Object dynamically allocated using new
        movies[1].setDetails("Titanic", "Romance", "9:00 PM");

        movies[2] = new Movie();        // Object dynamically allocated using new
        movies[2].setDetails("Avatar", "Fantasy", "5:00 PM");

        System.out.println("\nAvailable Movies:");
        for (Movie movie : movies) {
            movie.displayDetails();
            System.out.println();
        }

        Booking booking = new Booking();  // Booking object dynamically allocated using new
        booking.bookTicket(movies[1], 4);

        System.out.println("\nYour Booking:");
        booking.displayBookingDetails();

        // Using static methods to display total movies and tickets booked
        System.out.println("\nTotal Movies Created: " + Movie.getTotalMovies());
        System.out.println("Total Tickets Booked: " + Booking.getTotalTicketsBooked());
    }
}
