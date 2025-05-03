package week7day2;

public class NullifiedRefference {
String obj;
public NullifiedRefference () {
    
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullifiedRefference  t1=new NullifiedRefference ();
		t1=null;
//		 calling garbage collecter
		System.gc();
	}
	@Override
	protected void finalize()  throws Throwable{
		System.out.println(this.obj +"  sucessfully garbage collected");
	}  
}
