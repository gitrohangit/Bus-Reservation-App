package bus.reservation.system;

public class TicketCounter {

	private int seatsAvailable = 3;
	
	public synchronized void bookTicket(String pname,int numberOfSeats) {
		if(numberOfSeats<seatsAvailable && numberOfSeats > 0) {
			System.out.println("Hi " + pname + ",your seats are successfully booked.");
			seatsAvailable = seatsAvailable - numberOfSeats;
		}
		else {
			System.out.println("Hi " + pname + ",seats not available.");
		}
	}
}
