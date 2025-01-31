package DisJointDs;

public class p1 {
}
class DisjointSet {
    private int[] parent; // Array to track the parent of each element
    private int[] rank;   // Array to track the rank (or depth) of trees

    // Constructor: Initialize parent and rank arrays
    public DisjointSet(int size) {
        parent = new int[size];
        rank = new int[size];

        // MakeSet operation: Each element is its own parent
        for (int i = 0; i < size; i++) {
            parent[i] = i; // Each element is a root of itself
            rank[i] = 0;   // Initial rank is 0
        }
    }

    // FindSet operation with path compression
    public int findSet(int element) {
        if (parent[element] != element) {
            // Path compression: Make the parent the root
            parent[element] = findSet(parent[element]);
        }
        return parent[element];
    }

    // UnionSet operation using rank to optimize merging
    public void unionSet(int x, int y) {
        int rootX = findSet(x);
        int rootY = findSet(y);

        if (rootX != rootY) {
            // Union by rank
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX; // Attach rootY under rootX
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY; // Attach rootX under rootY
            } else {
                // If ranks are equal, choose one as root and increment its rank
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }

    // Makeset operation for a new element (if required dynamically)
    public void makeSet(int element) {
        if (element >= parent.length) {
            System.out.println("Element exceeds initial size, resizing needed.");
            return;
        }
        parent[element] = element;
        rank[element] = 0;
    }
}
 class Main {
    public static void main(String[] args) {
        int size = 7; // Example with 7 elements (0 to 6)
        DisjointSet ds = new DisjointSet(size);

        // MakeSet is implicit during initialization
        // UnionSet operations
        ds.unionSet(0, 1);
        ds.unionSet(1, 2);
        ds.unionSet(3, 4);
        ds.unionSet(4, 5);

        // FindSet operations
        System.out.println("Set representative of 0: " + ds.findSet(0)); // Should return 0
        System.out.println("Set representative of 2: " + ds.findSet(2)); // Should return 0
        System.out.println("Set representative of 4: " + ds.findSet(4)); // Should return 3

        // Check if two elements belong to the same set
        System.out.println(ds.findSet(0) == ds.findSet(2)); // true
        System.out.println(ds.findSet(0) == ds.findSet(3)); // false

        // UnionSet for two different sets
        ds.unionSet(2, 3);
        System.out.println(ds.findSet(0) == ds.findSet(5)); // true
    }
}
