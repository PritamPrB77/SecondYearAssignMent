package Assignment2_1;

import java.util.Objects;

class Animal {
    private String name;
    private String color;
    private String type; // "Pet" or "Wild"

    // Constructor
    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }
    /*
     * Without Overriding
     Default hashCode() (from Object class) generates memory-based hash, 
    which is different for each object even if attributes are the same.
    🔹 After Overriding
    We ensure hash codes depend on object properties (name, color, type).
    This helps in efficient storage in Hash-based collections like HashMap, HashSet.
     */

    // Overriding hashCode() to generate unique hash code
    @Override
    
    /*
     * Unlike Objects.hashCode(), which takes only a single object, Objects.hash() 
     * can take one or more objects and provides a hashcode for them. Under the hood, 
     * the hash() method works by putting the supplied objects into an array and calling 
     * Arrays.hashCode() on them. If we provide only one object to the Objects.hash() method,
     *  we can’t expect the same results as calling Objects.hashCode() on the object.

      First, let’s call Objects.hash() with two pairs of identical strings:
     */
    public int hashCode() {
        return Objects.hash(name, color, type);
    }

    // Overriding toString() for better object representation
    @Override
    public String toString() {
        return "Animal{Name='" + name + "', Color='" + color + "', Type='" + type + "'}";
    }

    // Getters (optional)
    public String getName() { return name; }
    public String getColor() { return color; }
    public String getType() { return type; }
}

// Driver Class
public class AnimalDriver {
    public static void main(String[] args) {
        // Creating Animal objects
        Animal tiger = new Animal("Tiger", "Orange", "Wild");
        Animal dog = new Animal("Dog", "Brown", "Pet");
        Animal dog2 = new Animal("Dog", "Brown", "Pet");
        Animal cat = new Animal("Cat", "White", "Pet");
        Animal elephant = new Animal("Elephant", "Gray", "Wild");

        // Printing hash codes of Animal objects
        System.out.println(tiger + " | HashCode: " + tiger.hashCode());
        
        System.out.println(dog + " | HashCode: " + dog.hashCode());
        System.out.println(dog + " | HashCode: " + dog2.hashCode());
        
        System.out.println(cat + " | HashCode: " + cat.hashCode());
        System.out.println(elephant + " | HashCode: " + elephant.hashCode());
    }
}

