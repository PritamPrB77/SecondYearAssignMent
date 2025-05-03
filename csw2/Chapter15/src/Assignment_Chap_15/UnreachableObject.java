package Assignment_Chap_15;

public class UnreachableObject {
	String obj;
	
	public UnreachableObject(String obj) {
		this.obj = obj;
	}
	
	public static void show() {

         UnreachableObject  t1=new   UnreachableObject ("Iter");
        display();
 
}
	
	public static void display() {
		UnreachableObject t2=new  UnreachableObject("cse");  
	}
	
	@Override
	  protected void finalize () throws Throwable {
		 System.out.println( this.obj+" Sucessfully garbage collected");
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 show();
			
		 
		 //explicoitely call the gc
		 System.gc();
	}

}
