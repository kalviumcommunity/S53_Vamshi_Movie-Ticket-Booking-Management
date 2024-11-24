public class SpecialOfferMovie extends Movie {
    private double discount;

    public SpecialOfferMovie(String title, String genre, String showtime, double discount) {
        super(title, genre, showtime); 
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public void generateTicket() {
        System.out.println("Generating ticket for special offer movie: " + getTitle());
        System.out.println("Discount Applied: $" + discount);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Special Offer Discount: $" + discount);
    }
}
