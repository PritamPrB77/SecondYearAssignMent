package week13day1;

public class EvenThread  extends Thread{

	public SharedNumber num;
	public EvenThread( SharedNumber num) {
		this.num=num;
	}
	@Override public void run() {
		
		try {
			for(int i=1;i<=10;i++) {
//				num.Even();
				if((i%2)==0) {
					num.Even(i);
				}
					
			}
		}
		catch( InterruptedException e) {
			System.out.println(e);
		}
	}
}
