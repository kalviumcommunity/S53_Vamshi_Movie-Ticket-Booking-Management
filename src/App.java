public class App {
    public static void main(String[] args) {
        Movie premiumMovie = new PremiumMovie("Inception", "Sci-Fi", "7:00 PM", 15.99);
        Movie specialOfferMovie = new SpecialOfferMovie("Titanic", "Romance", "9:00 PM", 5.00);

        Booking booking1 = new Booking("T123", premiumMovie, 2);
        Booking booking2 = new Booking("T124", specialOfferMovie, 3);

        TicketManager.bookTickets(booking1.getNumberOfTickets());
        TicketManager.bookTickets(booking2.getNumberOfTickets());

        System.out.println("\nBooking Details:");
        booking1.printTicketDetails();
        booking2.printTicketDetails();
        System.out.println("\nTotal Tickets Booked: " + TicketManager.getTotalTicketsBooked());
    }
}
