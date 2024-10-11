public class Booking {
    Movie movie;         
    int numberOfTickets;
    static int totalTicketsBooked = 0;  // Static variable to track total tickets booked

    public void bookTicket(Movie movie, int numberOfTickets) {
        this.movie = movie;  
        this.numberOfTickets = numberOfTickets;
        totalTicketsBooked += numberOfTickets;  // Increment total tickets booked
    }

    public void displayBookingDetails() {
        System.out.println("Booking Confirmed for: " + this.movie.title);
        System.out.println("Showtime: " + this.movie.showtime);
        System.out.println("Number of Tickets: " + this.numberOfTickets);
    }

    // Static member function to get total tickets booked
    public static int getTotalTicketsBooked() {
        return totalTicketsBooked;  // Accessing the static variable totalTicketsBooked
    }
}
