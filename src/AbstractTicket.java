public abstract class AbstractTicket {
    private String ticketID;

    public AbstractTicket(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getTicketID() {
        return ticketID;
    }

    public abstract void printTicketDetails();
}
