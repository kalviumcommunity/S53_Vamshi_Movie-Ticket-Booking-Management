public class PremiumMovie extends Movie implements TicketGenerator {
    private double ticketPrice;

    public PremiumMovie(String title, String genre, String showtime, double ticketPrice) {
        super(title, genre, showtime);
        this.ticketPrice = ticketPrice;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public void generateTicket() {
        System.out.println("Generating ticket for premium movie: " + getTitle());
        System.out.println("Price per ticket: $" + ticketPrice);
    }
}
