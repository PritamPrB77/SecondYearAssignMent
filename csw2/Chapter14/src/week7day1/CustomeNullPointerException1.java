package week7day1;
import java.util.Scanner;


class CustomeNullPointerException  extends Exception{
	CustomeNullPointerException(String s){
		super(s);
		System.out.println("Null pointer Exception ");
	}
}

public  class  CustomeNullPointerException1{

		public static void main(String[] args)  {
			Scanner sc = new Scanner (System.in);
			try {
				System.out.println("Enter the String: ");
				String s = sc.nextLine();
				checkString(s);
			}
			catch(CustomeNullPointerException obj) {
				System.out.println("Exception caught-Null pointer");
				System.out.println(obj.getMessage());;
			}
//			finally {
//				System.out.println("\nRest part...");
//			}

		}
		public static void checkString(String str) throws CustomeNullPointerException  {
			if(str==null || str.isEmpty())
				throw new CustomeNullPointerException("Invalid string ");
			int count =0;
			for(char c:str.toCharArray()) {
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


