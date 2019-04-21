package bus.reservation.client;

import bus.reservation.system.TicketBookingThread;
import bus.reservation.system.TicketCounter;

public class User {

	public static void main(String[] args) {
		TicketCounter tkt = new TicketCounter();
		TicketBookingThread t1 = new TicketBookingThread(tkt, "Rohan", 2);
		TicketBookingThread t2 = new TicketBookingThread(tkt, "Shaurya", 2);
		t1.start();
		t2.start();
	}

}
