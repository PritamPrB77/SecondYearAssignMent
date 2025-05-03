package StringAssignMent;

import java.util.Scanner;
/*
 * 
 * "Dynamic" ka matlab yeh hota hai ki:

Inka size automatically grow ho sakta hai jab aap naye characters add karte ho.

Aapko pehle se length fix karne ki zarurat nahi hoti (like arrays).


 */
public class StringgBuilderr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the initial string: ");
		StringBuilder stringBuilder = new StringBuilder(sc.nextLine());
		while (true) {
			System.out.println("\n--- Text Manipulation Menu ---");
			System.out.println("Current Text: \"" + stringBuilder + "\"");
			System.out.println("Choose an operation:");
			System.out.println("1. Add a substring at a specified position");
			System.out.println("2. Remove a range of characters");
			System.out.println("3. Modify a character at a specified index");
			System.out.println("4. Concatenate another string at the end");
			System.out.println("5. Display the current string");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.print("Enter the substring to add: ");
				String substring = sc.nextLine();
				System.out.print("Enter the position to add the substring: ");
				int pos = sc.nextInt();
				sc.nextLine();
				try {
					stringBuilder.insert(pos, substring);
				} catch (StringIndexOutOfBoundsException err) {
					System.out.println("Error: Invalid position.");
				}
				break;
			case 2:
				System.out.print("Enter the start index  and end for removal: ");
//				int s = sc.nextInt();
//				System.out.print("Enter the end index for removal: ");
//				int e = sc.nextInt();
				
				try {
					stringBuilder.delete(sc.nextInt(), sc.nextInt());
					sc.nextLine();
				} catch (StringIndexOutOfBoundsException err) {
					System.out.println("Error: Invalid indices.");
				}
				break;
			case 3:
				System.out.print("Enter the index of the character to modify: ");
				int charIndex = sc.nextInt();

				sc.nextLine();
				System.out.print("Enter the new character: ");
				char newChar = sc.nextLine().charAt(0);
				try {
					stringBuilder.setCharAt(charIndex, newChar);
				} catch (StringIndexOutOfBoundsException err) {
					System.out.println("Error: Invalid index.");
				}
				break;
			case 4:
				System.out.print("Enter the string to concatenate: ");
				String concatStr = sc.nextLine();
				stringBuilder.append(concatStr);
				break;
			case 5:
				System.out.println("Current String: \"" + stringBuilder + "\"");
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
