package Assignment3;

import java.util.Scanner;

class CustomeNullPointerException extends Exception{
	CustomeNullPointerException(String s){
		super(s);
		System.out.println("Null pointer Exception ");
	}
}

public class exp2 {
      String s;
      exp2(String s){
    	  this.s=s;
      }
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner (System.in);
		try {
			System.out.println("Enter the String: ");
			//String s = sc.nextLine();
			exp2 s1=new exp2(sc.nextLine());
			s1.checkString();
		}
		catch(CustomeNullPointerException  obj) {
			System.out.println("Exception caught-Null pointer");
			System.out.println(obj.getMessage());;
		}
		finally {
			System.out.println("Rest part...");
		}

	}
	public  void checkString() throws CustomeNullPointerException {
		//in userdefined exception and checked exception we also use throws clause
		if(this.s==null || s.isEmpty())
			throw new CustomeNullPointerException("Invalid string ");
		int count =0;
		for(char c:s.toCharArray()) {
			if(Character.isDigit(c)) {
				System.out.print(c+" ");
				count++;
			}
		}
		if(count==0) {
			System.out.println("No numeric character");
		}
	}

}




