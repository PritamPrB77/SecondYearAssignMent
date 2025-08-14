package WEEK12DAY3;

class TotalEarning extends Thread{
	int total=0;
	@Override
	public void run() {
	 //   synchronized(this) {
	    	
	    	for(int i=1;i<=10;i++) 
				total+=100;
			//this.notify();
			//Sysout(total)
	//}
}
}

public class MovieBookingApp {
  public static void main(String[]args)  {
	  TotalEarning th=new TotalEarning();
	  //here main is also an thread
	  // when prg run main thraed starts then we create obj then th start then th thread start here   then th go to the run 
	  // during adding the tota  data l at that time the current thread prints the total  then total totalmprinted
	  //its due to data inconsitancy ---> 
	  th.start();
//      synchronized(th) {
//    	  th.wait(); 
//    	  System.out.println("Total Earning "+th.total +" Rs");
//      }
	  //either of or we use
	  try {
		  th.join();
		  System.out.println("Total Earning "+th.total +" Rs");
	  }
	  catch(InterruptedException e) {
		  
	  }
	  
	  System.out.println("Total Earning "+th.total +" Rs");
  }
}
