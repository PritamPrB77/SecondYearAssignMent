package cswBITWISE;
import java.util.Scanner;
public class diff {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read two float numbers from the user
        System.out.print("Enter the first float number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second float number: ");
        float num2 = scanner.nextFloat();

        // Define epsilon
        float epsilon = 0.0001f; // A small value less than 1

        // Calculate the absolute difference
        float difference = Math.abs(num1 - num2);

        // Check if the difference is less than epsilon
        if (difference < epsilon) {
            System.out.println("The difference between the two numbers is less than " + epsilon);
        } else {
            System.out.println("The difference between the two numbers is not less than " + epsilon);
        }
    }
}
