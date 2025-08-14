package AssignMent_19;

class BookSeattt{
	int total=10;
 public  void  BookSeattt( int seat) {// its not a constructor 
	 // use the key word synchronized to make the  method synchronized
//	 public synchronized void  BookSeat( int seat) {

	 // create synchronized block instead of creating thatmethod
	 
 	synchronized(this) {
 		//since we use this it allows this method to synchronized only
 		// its more efficient that synchronized block  
 		if(total>=seat) {

 			System.out.println( seat+"Seat booked Successfully");
 			this.total-=seat;
 			System.out.println(" Seats Left "+total);
 		}
 		else {
 			System.out.println("Ticket Not Available ");
 			return;
 		}
 	}
}
}

class MovieSeatBooking extends Thread{
	static BookSeattt  ticket=new BookSeattt();
	int seat;
	@Override public void run() {
		ticket.BookSeattt(seat);
	}
}

public class MovieSeatBookingApp {
public static void main(String[]args) {
	MovieSeatBooking   p1=new MovieSeatBooking ();
	p1.seat=7;
	p1.start();
	MovieSeatBooking    p2=new MovieSeatBooking ();
	p2.seat=6;
	p2.start();
}
}
