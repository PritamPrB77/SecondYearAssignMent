package week10day1;

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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
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
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public BNode getLeft() {
		return left;
	}
	public void setLeft(BNode left) {
		this.left = left;
	}
	public BNode getRight() {
		return right;
	}
	public void setRight(BNode right) {
		this.right = right;
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
}
public int findmin() {
	BNode curr=root;;
	if(curr==null) return Integer.MAX_VALUE;
	while(curr.getLeft()!=null) {
		curr=curr.getLeft();
	}
	return curr.getCountry().population;
			
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
        System.out.println(bst.findmin()); 
//        System.out.println("\nCountry with Maximum Population:"); 
//        System.out.println(bst.findMax()); 
    } 
} 