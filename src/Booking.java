public class Booking {
    Movie movie;         
    int numberOfTickets;   

    public void bookTicket(Movie movie, int numberOfTickets) {
        this.movie = movie;  // Referencing dynamically allocated Movie object
        this.numberOfTickets = numberOfTickets;
    }

    public void displayBookingDetails() {
        System.out.println("Booking Confirmed for: " + this.movie.title);
        System.out.println("Showtime: " + this.movie.showtime);
        System.out.println("Number of Tickets: " + this.numberOfTickets);
    }
}
