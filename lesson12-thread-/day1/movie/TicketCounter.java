package movie;

public class TicketCounter {
	private int availableSeats=3;
	public synchronized void bookTicket(String name,int noOfSeats) {
		if((availableSeats>noOfSeats) && (availableSeats>0)) {
			System.out.println("Hi"+name +"  "+noOfSeats+"booked successfully");
			availableSeats=availableSeats-noOfSeats;
		}
		else
			System.out.println("Hi"+name+"Seats not available");
	}

}
