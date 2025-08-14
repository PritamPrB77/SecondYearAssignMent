package week2day1;

class x{
	int x;
	public void print() {
		System.out.println("Hello gAys");
	}
}
public class inheritance extends x {
	public void print() {
		System.out.println("Hello gAysssssssssssssssssss");
	}
	
	public static void main(String[]args) {
	   x s1=new x();
	   s1.print();
	   x s2=new inheritance();
	   s2.print();
	   
	   
	}
}
