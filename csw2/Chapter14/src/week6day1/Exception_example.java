package week6day1;

public class Exception_example {

	public static void main(String[] args) {
		try {
			int arr[]= {5,8,2,9,0};
			int x=2/arr[4];
			System.out.println("value of x is:"+x);
			
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException   e) {
			System.out.println(e);
			System.out.println(e.getMessage());
	         e.printStackTrace();
		}
		finally {
			System.out.println("you cant stop me to run , mereko ruk nehi paoge");
		}
	}
}

