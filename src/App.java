public class App {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setDetails("Inception", "Sci-Fi", "7:00 PM");

        Movie movie2 = new Movie();
        movie2.setDetails("Titanic", "Romance", "9:00 PM");

        movie1.showObjectCreated();
        movie2.showObjectCreated();

        System.out.println("\nAvailable Movies:");
        movie1.displayDetails();
        System.out.println();
        movie2.displayDetails();

        Booking booking = new Booking();
        
        booking.bookTicket(movie1, 3);

        System.out.println("\nYour Booking:");
        booking.displayBookingDetails();
    }
}
