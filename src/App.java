public class App {
    public static void main(String[] args) {
        // Using default constructor and setting details later
        Movie movie1 = new Movie("Inception", "Sci-Fi", "7:00 PM");
        PremiumMovie movie2 = new PremiumMovie("Titanic", "Romance", "9:00 PM", 15.99);
        PremiumMovie movie3 = new PremiumMovie("Avatar", "Fantasy", "5:00 PM", 18.50);

        System.out.println("\nAvailable Movies:");
        movie1.displayDetails();
        System.out.println();
        movie2.displayDetails();
        System.out.println();
        movie3.displayDetails();

        // Regular Booking
        Booking booking1 = new Booking(movie1, 3);

        // Special Offer Booking
        SpecialOfferBooking booking2 = new SpecialOfferBooking(movie3, 2, 5.00);

        System.out.println("\nYour Bookings:");
        booking1.displayBookingDetails();
        System.out.println();
        booking2.displayBookingDetails();

        System.out.println("\nTotal Movies Created: " + Movie.getTotalMovies());
        System.out.println("Total Tickets Booked: " + Booking.getTotalTicketsBooked());
    }
}
