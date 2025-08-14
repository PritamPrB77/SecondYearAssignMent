package week13day1;

public class SharedResource {
	private boolean isFlag=true;
// we use this Flag to overcome dead lock situation  else both are wait and deadlock situation creates
	
//Question: variation:--      eithger give somw task to perofrom or some logic to perform (1)
	// variation is: size of Producer like fast producer do some s size tasks like 2 tasks  then consumer consume like this
	public void Produce() throws InterruptedException {
		synchronized(this) {
	while(!isFlag)
			wait();// release the lock and wait(1)
		System.out.println(" Producer: Hello Hi.............");
		isFlag=false;
		notify();//wakes up the consume
		}
	}
	
	public void Consumer() throws InterruptedException {
		synchronized(this) {
		while(isFlag)// when producer produce the data it wait then it consume 
			wait();// release the lock and wait for its turn
		System.out.println(" Consumer: Bye..............");
				isFlag=true;
		notify();;//wakes up the  producer
		}
	}
	//both are common resources
}
// both producer and consumer waiting it and creates a deadlock situation
