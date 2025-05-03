package Assignment_Chap_15;

class Student {
    private String name;
    private int rollNumber;
    private String course;

    // Constructor
    Student(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }

    // Overriding finalize method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student object with roll number " + rollNumber + " is garbage collected.");
      
    }
}

public class chatgptsolun  {
    public static void main(String[] args) {
        // Runtime instance for memory monitoring
        Runtime runtime = Runtime.getRuntime();
        
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory before creating students: " + runtime.freeMemory());

        // Creating student objects
        Student s1 = new Student("Pritam", 101, "Computer Science");
        Student s2 = new Student("Anjali", 102, "Mechanical Engineering");

        // Display student details
        s1.displayInfo();
        s2.displayInfo();

        // Setting objects to null so they become eligible for garbage collection
        s1 = null;
        s2 = null;

        // Suggesting JVM to perform Garbage Collection
        System.gc();

        System.out.println("Free Memory after requesting GC: " + runtime.freeMemory());
    }
}
