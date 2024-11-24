public class Booking extends AbstractTicket {
    private Movie movie;
    private int numberOfTickets;
    private static int totalTicketsBooked = 0;

    public Booking(String ticketID, Movie movie, int numberOfTickets) {
        super(ticketID);
        this.movie = movie;
        this.numberOfTickets = numberOfTickets;
        totalTicketsBooked += numberOfTickets;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public static int getTotalTicketsBooked() {
        return totalTicketsBooked;
    }

    @Override
    public void printTicketDetails() {
        System.out.println("Ticket ID: " + getTicketID());
        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Showtime: " + movie.getShowtime());
        System.out.println("Number of Tickets: " + numberOfTickets);
    }
}
