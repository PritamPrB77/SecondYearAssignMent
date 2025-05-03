package week8day1;

public class StrBuilderClass {
	  
    public static void main(String[] args) {

        // Create a new StringBuilder with the
        // initial content "GeeksforGeeks"
        StringBuilder sb = new StringBuilder("GeeksforGeeks");
        System.out.println("Initial StringBuilder: " + sb);

        // 1. Append a string to the StringBuilder
        sb.append(" is awesome!");
        System.out.println("After append: " + sb);

        // 2. Insert a substring at a specific position
        sb.insert(13, " Java");
        System.out.println("After insert: " + sb);

        // 3. Replace a substring with another string
        sb.replace(0, 5, "Welcome to");
        System.out.println("After replace: " + sb);

        // 4. Delete a substring from the StringBuilder
        sb.delete(8, 14);
        System.out.println("After delete: " + sb);

        // 5. Reverse the content of the StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. Get the current capacity of the StringBuilder
        int capacity = sb.capacity();
        System.out.println("Current capacity: " + capacity);

        // 7. Get the length of the StringBuilder
        int length = sb.length();
        System.out.println("Current length: " + length);

        // 8. Access a character at a specific index
        char charAt5 = sb.charAt(5);
        System.out.println("Character at index 5: " + charAt5);

        // 9. Set a character at a specific index
        sb.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sb);

        // 10. Get a substring from the StringBuilder
        String substring = sb.substring(5, 10);
        System.out.println("Substring (5 to 10): " + substring);

        // 11. Find the index of a specific substring
        sb.reverse(); // Reversing back to original order for search
        
        int indexOfGeeks = sb.lastIndexOf("Geeks");
        System.out.println("Index of 'Geeks': " + indexOfGeeks);

        // 12. Delete a character at a specific index
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // 13. Convert the StringBuilder to a String
        String result = sb.toString();
        
        System.out.println("Final String: " + result);
    }
}
