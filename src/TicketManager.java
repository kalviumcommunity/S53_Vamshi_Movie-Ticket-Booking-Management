public class TicketManager {
    private static int totalTicketsBooked = 0;

    public static void bookTickets(int numberOfTickets) {
        totalTicketsBooked += numberOfTickets;
    }

    public static int getTotalTicketsBooked() {
        return totalTicketsBooked;
    }
}
