public class App {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setDetails("Inception", "Sci-Fi", "7:00 PM");

        Movie movie2 = new Movie("Titanic", "Romance", "9:00 PM");
        Movie movie3 = new Movie("Avatar", "Fantasy", "5:00 PM");

        System.out.println("\nAvailable Movies:");
        movie1.displayDetails();
        System.out.println();
        movie2.displayDetails();
        System.out.println();
        movie3.displayDetails();

        Booking booking1 = new Booking();
        booking1.setMovie(movie2);
        booking1.setNumberOfTickets(4);

        Booking booking2 = new Booking(movie3, 2);

        System.out.println("\nYour Bookings:");
        booking1.displayBookingDetails();
        System.out.println();
        booking2.displayBookingDetails();

        System.out.println("\nTotal Movies Created: " + Movie.getTotalMovies());
        System.out.println("Total Tickets Booked: " + Booking.getTotalTicketsBooked());
    }
}
