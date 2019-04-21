package bus.reservation.system;

public class TicketBookingThread extends Thread {

	private TicketCounter ticketcounter;
	private int numberOfSeats;
	private String passengerName;
	
	public TicketBookingThread(TicketCounter ticketcounter,String passengerName,int numberOfSeats) {
		this.ticketcounter = ticketcounter;
		this.numberOfSeats = numberOfSeats;
		this.passengerName = passengerName;
	}
	
	public void run(){
		ticketcounter.bookTicket(passengerName, numberOfSeats);
	}
}
