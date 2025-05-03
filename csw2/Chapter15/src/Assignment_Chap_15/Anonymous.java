package Assignment_Chap_15;

public class Anonymous {
String myObject; 
public Anonymous(String myObject) 
{ 
	this.myObject = myObject; 

} 
public static void main(String args[]) 
{ 
//Anonymous Object is being initialized without a reference id
  new Anonymous("testObject1"); 
//Requesting garbage collector to remove the anonymous object
 System.gc(); 
} 
@Override
protected void finalize() throws Throwable {
	//following line will confirm the garbage collected method name
	System.out.println("Garbage collection is succcessful for " + this.myObject);
}
} 


