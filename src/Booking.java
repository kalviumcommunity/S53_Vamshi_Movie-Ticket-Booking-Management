public class Booking {
    private Movie movie;         
    private int numberOfTickets;
    private static int totalTicketsBooked = 0;

    public Booking() {}

    public Booking(Movie movie, int numberOfTickets) {
        this.movie = movie;
        this.numberOfTickets = numberOfTickets;
        totalTicketsBooked += numberOfTickets;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
        totalTicketsBooked += numberOfTickets;
    }

    public void displayBookingDetails() {
        System.out.println("Booking Confirmed for: " + this.movie.getTitle());
        System.out.println("Showtime: " + this.movie.getShowtime());
        System.out.println("Number of Tickets: " + this.numberOfTickets);
    }

    public static int getTotalTicketsBooked() {
        return totalTicketsBooked;
    }
}
