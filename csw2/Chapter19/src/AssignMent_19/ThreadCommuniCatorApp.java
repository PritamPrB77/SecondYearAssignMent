package AssignMent_19;

class SharedNumber {

	private boolean isFlag=true;
//	int i=1,j=2;

		public void Odd(int i) throws InterruptedException {
			synchronized(this) {
			while(!isFlag)
				wait();// release the lock and wait(1)
//			System.out.print((i)+" ");
//			 i+=2;
			System.out.print(i+" ");
			isFlag=false;
			notify();//wakes up the consume
			}
		}
		
		public void Even(int  i) throws InterruptedException {
			///throws InterruptedException   not give it throws erroe
			synchronized(this) {
			while(isFlag)// when producer produce the data it wait then it consume 
				wait();// release the lock and wait for its turn
//			System.out.print( (j)+" ");
//			j+=2;
			System.out.print(i+" ");
			isFlag=true;
			notify();;//wakes up the  producer
			}
		}
	
}



//EvenThread
 class EvenThread  extends Thread{

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
 
//odd Thread
 class OddThread  extends Thread{
	  
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

 

public class ThreadCommuniCatorApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SharedNumber numPrintter =new SharedNumber();
		 OddThread o=new OddThread(numPrintter);
		EvenThread e=new EvenThread(numPrintter);
	
		 o.start();
		 e.start(); 
	}
}
