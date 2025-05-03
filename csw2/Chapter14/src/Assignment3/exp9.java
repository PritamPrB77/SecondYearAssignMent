package Assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter an integer: ");
	            int num = scanner.nextInt();  // If user enters a non-integer, exception occurs
	            System.out.println("You entered: " + num);
	        } catch (InputMismatchException e) {
	            System.out.println("Error: Invalid input! Please enter an integer."+e);
	}

}
}
