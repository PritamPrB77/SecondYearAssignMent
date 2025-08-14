package week12day2;


public class Sleepingthread  extends Thread{
    Sleepingthread(String name){
    	super(name);
    }    
    @Override public void run() {
    	System.out.println(getName()+"Started..");
    	
    	for(int i=1;i<=5;i++) {
    		try {
    			Thread.sleep(500);
    			// when thread 1 is sleep at that time thread 2  is run            
    		}
    		catch(InterruptedException e) {
    			System.out.println("Errors...");
    		}
    		System.out.println(getName()+" i-"+i);
    	}
    	System.out.println(getName()+ "Finished..");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sleepingthread th1=new Sleepingthread("First");//thread Naming Conventions
		Sleepingthread th2=new Sleepingthread("Second");// thread Naming Conventions
		th1.start();
		th1.setName("Hero");
	th1.setPriority(MAX_PRIORITY);// maxPriority:-10
	  try {
		th1.join();
		
		/*
		 * th1 start hota hai.

main thread join() par ruk jaata hai.

Jab th1 khatam ho jata hai, tab main thread aage badhta hai.
		 */
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		th2.start();
//		try {
//			th1.join();//
////			other thread wait when thread 1 starts its execution  and  for  its completion
//		}
//		catch(InterruptedException e) {
//			System.out.println(e);
//		}		
//	    th1.start();
		try {
			th2.join();//
//			other thread wait when thread 2 starts its execution  and  for  its completion
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
//	    
//		// when thread 1 is sleep at that time thread 2  is run  
		System.out.println(th1.getPriority());// its Priority Is Max Priority:-10
		System.out.println(th2.getPriority());// its Priority is normal Priority:-5
		
		
	}
}
