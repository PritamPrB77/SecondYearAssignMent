package ASSIGNMENT_2_2;
import java.util.*;


 class Book { 
    private int id; 
    private String name; 
    private String author; 
    private int quantity; 
    public Book(int id, String name, String author, int quantity) { 
        this.id = id; 
        this.name = name; 
        this.author = author; 
        this.quantity = quantity; 
    } 
    public int getId() { 
        return id; 
    } 
    public String getName() { 
        return name; 
    } 
    public String getAuthor() { 
        return author; 
    } 
    public int getQuantity() { 
        return quantity; 
    } 
    public String toString() { 
        return "ID: " + id + ", Name: " + name + ", Author: " + author + ", Quantity: " + quantity; 
    } 
 }



public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, Book> books = new HashMap<>(); 
	     Scanner sc = new Scanner(System.in); 
	     books.put(1, new Book(1, "1984", "George Orwell", 5)); 
	     books.put(2, new Book(2, "To Kill a Mockingbird", "Harper Lee", 3)); 
	     System.out.println("Collection of Books:"); 
	     for (Map.Entry<Integer, Book> entry : books.entrySet()) { 
	         System.out.println(entry.getValue()); 
	     } 
	     System.out.print("\nEnter book name to check: "); 
	     String bookName = sc.nextLine(); 
	     boolean bookExists = false; 
	     for (Book book : books.values()) { 
            if (book.getName().equals(bookName)) { 
	             bookExists = true; 
	             break; 
	         } 
	     } 
	     System.out.println("Book exists: " + bookExists); 
	     System.out.print("\nEnter book ID to remove: "); 
	     int bookId = sc.nextInt(); 
	     Book removedBook = books.remove(bookId);   
	     if (removedBook != null) { 
	         System.out.println("Removed book: " + removedBook); 
	     } else { 
	         System.out.println("Book ID not found."); 
	     } 
	     System.out.println("\nUpdated Collection of Books:"); 
	     for (Map.Entry<Integer, Book> entry : books.entrySet()) { 
	         System.out.println(entry.getValue()); 
	     } 

	}

}
