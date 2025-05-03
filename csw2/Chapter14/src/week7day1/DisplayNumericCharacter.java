package week7day1;


	import java.util.Scanner;

	public class DisplayNumericCharacter {

		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			try {
				System.out.println("Enter the String: ");
				String s = sc.nextLine();
				checkString(s);
			}
			catch(NullPointerException obj) {
				System.out.println("Exception caught-Null pointer");
				System.out.println(obj.getMessage());;
			}
			finally {
				System.out.println("Rest part...");
			}

		}
		public static void checkString(String str) {
			if(str==null || str.isEmpty())
				throw new NullPointerException("Invalid string ");
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
	


