public class PremiumMovie extends Movie {
    private double ticketPrice;

    public PremiumMovie(String title, String genre, String showtime, double ticketPrice) {
        super(title, genre, showtime); // Call parent constructor
        this.ticketPrice = ticketPrice;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent method
        System.out.println("Ticket Price: $" + ticketPrice);
    }
}
