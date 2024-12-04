public class Booking extends AbstractTicket {
    private Movie movie;
    private int numberOfTickets;

    public Booking(String ticketID, Movie movie, int numberOfTickets) {
        super(ticketID);
        this.movie = movie;
        this.numberOfTickets = numberOfTickets;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    @Override
    public void printTicketDetails() {
        System.out.println("Ticket ID: " + getTicketID());
        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Showtime: " + movie.getShowtime());
        System.out.println("Number of Tickets: " + numberOfTickets);
    }
}
