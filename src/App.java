public class App {
    public static void main(String[] args) {
        // Creating movie objects
        Movie premiumMovie = new PremiumMovie("Inception", "Sci-Fi", "7:00 PM", 15.99);
        Movie specialOfferMovie = new SpecialOfferMovie("Titanic", "Romance", "9:00 PM", 5.00);
        Movie imaxMovie = new ImaxMovie("Avatar 2", "Action", "6:30 PM", 20.00);

        // Display movie details
        System.out.println("Premium Movie Details:");
        premiumMovie.displayDetails();
        System.out.println();

        System.out.println("Special Offer Movie Details:");
        specialOfferMovie.displayDetails();
        System.out.println();

        System.out.println("IMAX Movie Details:");
        imaxMovie.displayDetails();
        System.out.println();

        // Create bookings
        Booking booking1 = new Booking("T123", premiumMovie, 2);
        Booking booking2 = new Booking("T124", specialOfferMovie, 3);
        Booking booking3 = new Booking("T125", imaxMovie, 4);

        // Print booking details
        System.out.println("\nBooking Details:");
        booking1.printTicketDetails();
        System.out.println();
        booking2.printTicketDetails();
        System.out.println();
        booking3.printTicketDetails();

        // Display total statistics
        System.out.println("\nTotal Movies Created: " + Movie.getTotalMovies());
        System.out.println("Total Tickets Booked: " + Booking.getTotalTicketsBooked());
    }
}
