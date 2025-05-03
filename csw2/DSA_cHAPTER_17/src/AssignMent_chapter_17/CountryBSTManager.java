package AssignMent_chapter_17;

	class Country { 
	    String name; 
	    int population; 
	    public Country(String name, int population) { 
	        this.name = name; 
	        this.population = population; 
	    } 
	    public String toString() { 
	        return name + " (Population: " + population + ")"; 
	    } 
	} 
	class BNode { 
	    Country country; 
	    BNode left; 
	    BNode right; 
	    public BNode(Country country) { 
	        this.country = country; 
	        this.left = null; 
	        this.right = null; 
	    } 
	} 
	class BSTCountry { 
	    private BNode root; 
	    public BSTCountry() { 
	        this.root = null; 
	    } 
	    public void insert(Country country) { 
	        root = insertRec(root, country); 
	    } 
	    private BNode insertRec(BNode node, Country country) { 
	        if (node == null) { 
	            return new BNode(country); 
	        } 
	        if (country.population < node.country.population) { 
	            node.left = insertRec(node.left, country); 
	        } else if (country.population > node.country.population) { 
	            node.right = insertRec(node.right, country); 
	        } 
	        return node; 
	    } 
	    public void inOrderTraversal() { 
	        inOrderRec(root); 
	    } 
	    private void inOrderRec(BNode node) { 
	        if (node != null) { 
	            inOrderRec(node.left); 
	            System.out.println(node.country); 
	            inOrderRec(node.right); 
	        } 
	    } 
	    public Country findMin() {  if (root == null) return null; 
        return findMinRec(root).country; 
    } 
 
    private BNode findMinRec(BNode node) { 
        if (node.left == null) return node; 
        return findMinRec(node.left); 
    } 
    public Country findMax() { 
        if (root == null) return null; 
        return findMaxRec(root).country; 
    } 
    private BNode findMaxRec(BNode node) { 
        if (node.right == null) return node; 
        return findMaxRec(node.right); 
    } 
} 
public class CountryBSTManager { 
    public static void main(String[] args) { 
        BSTCountry bst = new BSTCountry(); 
        bst.insert(new Country("India", 1400000000)); 
        bst.insert(new Country("China", 1412000000)); 
        bst.insert(new Country("USA", 331000000)); 
        bst.insert(new Country("Indonesia", 273000000)); 
        bst.insert(new Country("Pakistan", 225000000)); 
        System.out.println("In-order Traversal:"); 
        bst.inOrderTraversal(); 
        System.out.println("\nCountry with Minimum Population:"); 
        System.out.println(bst.findMin()); 
        System.out.println("\nCountry with Maximum Population:"); 
        System.out.println(bst.findMax()); 
    } 
} 

