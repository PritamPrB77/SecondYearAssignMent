package week13day1;

public class ConsumerThread  extends Thread{
	private SharedResource printer;
	  public ConsumerThread(SharedResource printer) {
		  this.printer=printer;
	  }
	
@Override public void run() {
	try {
		for(int i=0;i<=5;i++) {
			printer.Consumer();
			  
		}
	}
	catch(InterruptedException e) {
		System.out.println(e);
	}
}
	

}
