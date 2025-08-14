package WEEK12DAY3;

class BookSeattt{
	int total=10;
	BookSeattt(int x){
		this.total=x;
	}
 public  void  BookSeat( int seat) {// its not a constructor 
	 // use the key word synchronized to make the  method synchronized
//	 public synchronized void  BookSeat( int seat) {
	 System.out.println(" Hi  "+Thread.currentThread().getName());
	 System.out.println(" Hi  "+Thread.currentThread().getName());
	 System.out.println(" Hi  "+Thread.currentThread().getName());
	 System.out.println(" Hi  "+Thread.currentThread().getName());
	 // step-1> create common synchronized method or
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

public class movieBookSeatUsingConcureent extends Thread {
	 static BookSeattt ticket ;// static is mandatory
	 // do it static because when thread initialize , it took at new variable   since its object not class variable 
	 // to do it for whole class we need to do it static then it think that object associated with class its not global object
	 // --. one way to do the object static also 
	int seat;
	@Override
	public void run() {
		ticket.BookSeat(seat);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movieBookSeatUsingConcureent  p1=new movieBookSeatUsingConcureent();
		movieBookSeatUsingConcureent.ticket=new BookSeattt(10);
		p1.seat=7;
		p1.start();
		movieBookSeatUsingConcureent   p2=new movieBookSeatUsingConcureent();
		p2.seat=6;
		p2.start();
	// Data Inconstancy problem arises due to synchronization

		
		
	}

}
