public class App {
    public static void main(String[] args) {
        // Creating movie objects
        Movie premiumMovie = new PremiumMovie("Inception", "Sci-Fi", "7:00 PM", 15.99);
        Movie specialOfferMovie = new SpecialOfferMovie("Titanic", "Romance", "9:00 PM", 5.00);

        // Display movie details and generate tickets
        System.out.println("Premium Movie Details:");
        premiumMovie.displayDetails();
        premiumMovie.generateTicket();
        System.out.println();

        System.out.println("Special Offer Movie Details:");
        specialOfferMovie.displayDetails();
        specialOfferMovie.generateTicket();
        System.out.println();

        Booking booking1 = new Booking("T123", premiumMovie, 2);
        Booking booking2 = new Booking("T124", specialOfferMovie, 3);

        System.out.println("\nBooking Details:");
        booking1.printTicketDetails();
        System.out.println();
        booking2.printTicketDetails();

        System.out.println("\nTotal Movies Created: " + Movie.getTotalMovies());
        System.out.println("Total Tickets Booked: " + Booking.getTotalTicketsBooked());
    }
}
