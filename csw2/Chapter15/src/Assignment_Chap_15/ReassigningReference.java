package Assignment_Chap_15;



public class ReassigningReference {

	String obj;
	public ReassigningReference(String string) {
		// TODO Auto-generated constructor stub
		this.obj=string;
	}


	public static void main(String []main) {
		ReassigningReference t1=new  ReassigningReference("cse");
		 
//		  since t1 pointing to t2 --> now cse is a garbage collector
		ReassigningReference t2=new  ReassigningReference("iter");
		 t1=t2;
		 System.gc();
		 
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println(this.obj +"  sucessfully garbage collected");
	}

}
