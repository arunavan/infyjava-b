package movie;

public class TicketBookingThread extends Thread {
	private TicketCounter ticketCounter;
	private String name;
	private int noOfSeats;
	public TicketBookingThread(TicketCounter ticketCounter, String name, int noOfSeats) {
		//super();
		this.ticketCounter = ticketCounter;
		this.name = name;
		this.noOfSeats = noOfSeats;
	}
	public void run()
	{
		ticketCounter.bookTicket(name, noOfSeats);
	}

}
