package week13day1;

public class SharedNumber {

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
