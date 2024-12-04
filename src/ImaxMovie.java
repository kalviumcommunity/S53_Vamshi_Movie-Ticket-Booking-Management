public class ImaxMovie extends Movie {
    private double surcharge;

    public ImaxMovie(String title, String genre, String showtime, double surcharge) {
        super(title, genre, showtime);
        this.surcharge = surcharge;
    }

    public double getSurcharge() {
        return surcharge;
    }

    @Override
    public void generateTicket() {
        System.out.println("Generating ticket for IMAX movie: " + getTitle());
        System.out.println("Surcharge: $" + surcharge);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("IMAX Surcharge: $" + surcharge);
    }
}
