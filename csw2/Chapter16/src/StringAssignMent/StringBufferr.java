package StringAssignMent;

import java.util.*;

/*
 * 
 * "Dynamic" ka matlab yeh hota hai ki:

Inka size automatically grow ho sakta hai jab aap naye characters add karte ho.

Aapko pehle se length fix karne ki zarurat nahi hoti (like arrays).


 */
public class StringBufferr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer textBuffer = new StringBuffer();
		while (true) {
			System.out.println("\n--- Simple Text Editor ---");
			System.out.println("Current Text: \"" + textBuffer + "\"");
			System.out.println("Length: " + textBuffer.length() + ", Capacity: " + textBuffer.capacity());
			System.out.println("Choose an operation:");
			System.out.println("1. Append a string");
			System.out.println("2. Insert a string at an index");
			System.out.println("3. Delete text between indices");
			System.out.println("4. Reverse the text");
			System.out.println("5. Replace text between indices");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();// observe some hinggs
			switch (choice) {
			case 1:
				System.out.print("Enter the string to append: ");
				String appText = sc.nextLine();
				textBuffer.append(appText);
				break;
			case 2:
				System.out.print("Enter the string to insert: ");
				String insText = sc.nextLine();
				System.out.print("Enter the index where you want to insert: ");
				int n = sc.nextInt();
				sc.nextLine();//here also
				try {
					textBuffer.insert(n, insText);
				} catch (StringIndexOutOfBoundsException e) {
					System.out.println("Error: Invalid index.");
				}
				break;
			case 3:
				System.out.print("Enter the start index for deletion: ");
				int s = sc.nextInt();
				System.out.print("Enter the end index for deletion: ");
				int e = sc.nextInt();
				sc.nextLine();
				try {
					textBuffer.delete(s, e);
				} catch (StringIndexOutOfBoundsException err) {
					System.out.println("Error: Invalid indices.");

				}
				break;
			case 4:
				textBuffer.reverse();

				break;
			case 5:
				System.out.print("Enter the start index for replacement: ");
				int start = sc.nextInt();
				System.out.print("Enter the end index for replacement: ");
				int end = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the replacement string: ");
				String repText = sc.nextLine();
				try {
					textBuffer.replace(start, end, repText);
				} catch (StringIndexOutOfBoundsException err) {
					System.out.println("Error: Invalid indices.");
				}
				break;
			case 6:
				sc.close();
				return;
			default:
				System.out.println("Invalid choice! Please try again.");
				break;
			}
		}
	}

}
