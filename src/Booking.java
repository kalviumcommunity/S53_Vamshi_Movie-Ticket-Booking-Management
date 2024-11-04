public class Booking {
    private Movie movie;         
    private int numberOfTickets;
    private static int totalTicketsBooked = 0;  

    // Accessor and Mutator for movie
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    // Accessor and Mutator for numberOfTickets
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
