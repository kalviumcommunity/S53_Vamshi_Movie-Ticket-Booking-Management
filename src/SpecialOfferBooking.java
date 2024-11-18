public class SpecialOfferBooking extends Booking {
    private double discount;

    public SpecialOfferBooking(Movie movie, int numberOfTickets, double discount) {
        super(movie, numberOfTickets); // Call parent constructor
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public void displayBookingDetails() {
        super.displayBookingDetails(); // Call parent method
        System.out.println("Discount Applied: $" + discount);
    }
}
