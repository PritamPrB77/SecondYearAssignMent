package week13day1;

public class OddThread  extends Thread{
  
	public SharedNumber num;
	public OddThread( SharedNumber num) {
		this.num=num;
	}
	@Override public void run() {
		
		try {
			for(int i=0;i<10;i++) {
				if(!((i%2)==0)) {
				num.Odd(i);
				}
			}
		}
		catch( InterruptedException e) {
			System.out.println(e);
		}
	}

}
