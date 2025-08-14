package week13day1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 SharedResource printer =new SharedResource();
 ProducerThread p=new ProducerThread(printer);
 ConsumerThread c=new ConsumerThread(printer);
 p.start();
 c.start();
	}

}
