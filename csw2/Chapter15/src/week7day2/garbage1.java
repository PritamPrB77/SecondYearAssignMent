package week7day2;

public class garbage1 {
String obj;
public garbage1(String string) {
	// TODO Auto-generated constructor stub
	this.obj=string;
}


public static void main(String []main) {
	 garbage1 t1=new  garbage1("cse");
	 
//	  since t1 pointing to t2 --> now cse is a garbage collector
	 garbage1 t2=new  garbage1("iter");
	 t1=t2;
	 System.gc();
	 
}
@Override
protected void finalize() {
	System.out.println(this.obj +"  sucessfully garbage collected");
}

}
