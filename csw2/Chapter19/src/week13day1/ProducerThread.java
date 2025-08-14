package week13day1;

public class ProducerThread  extends Thread{
	private SharedResource printer;
	  public ProducerThread(SharedResource printer) {
		  this.printer=printer;
	  }
	
@Override public void run() {
	try {
		for(int i=0;i<=5;i++) {
			
			  printer.Produce();
		}
	}
	catch(InterruptedException e) {
		System.out.println(e);
	}
}
	

}
