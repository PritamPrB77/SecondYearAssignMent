package WEEK12DAY3;


class BookSeat{
	int total=10;
public void  BookSeat( int seat) {// its not a constructor 
	if(total>=seat) {

		System.out.println( seat+"Seat booked Successfully");
		this.total-=seat;
		System.out.println(" Seats Left "+total);
	}
}
}


public class MovieBookSeat extends Thread {
	 BookSeat ticket =new BookSeat();
	int seat;
	@Override
	public void run() {
		ticket.BookSeat(seat);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieBookSeat   p1=new MovieBookSeat();
		p1.seat=7;
		p1.start();
		MovieBookSeat   p2=new MovieBookSeat();
		p2.seat=6;
		p2.start();
	// Data Inconstancy problem arises due to synchronization
		

	}

}
