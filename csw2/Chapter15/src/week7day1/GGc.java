package week7day1;

public class GGc {
	String obj;
	
	public GGc(String obj) {
		this.obj=obj;
		
	}
	public static void show() {

                      GGc t1=new  GGc("Iter");
                      display();
                      
		
	}
	
	public static void display() {
	     GGc t2=new  GGc("cse");
	     
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 show();
	
	 
	 //explicoitely call the gc
	 System.gc();
	 //or
	 //Runtime.getRuntime().gc();
	 
	 //overriding Dinalize Method to Check
	 // which object is garbage collected
	 
	 // this method can be  used to perform cleanup
	 // processing(releasing non-memory resources) 
	 //i.e if Scanner class open then it terminate that, performing closing the file
	}
@Override
  protected void finalize () throws Throwable {
	 System.out.println( this.obj+" Sucessfully garbage collected");
     }
	

}
