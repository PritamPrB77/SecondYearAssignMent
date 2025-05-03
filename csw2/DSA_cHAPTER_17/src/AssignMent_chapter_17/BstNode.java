package AssignMent_chapter_17;


class BSTNode { 
    int info; 
    BSTNode left, right; 
    public BSTNode(int info) { 
        this.info = info; 
        this.left = null; 
        this.right = null; 
    } 
    public void insert(int value) { 
        if (value < this.info) { 
            if (this.left == null) { 
                this.left = new BSTNode(value); 
            } else { 
                this.left.insert(value); 
            } 
        } else if (value > this.info) { 
            if (this.right == null) { 
                this.right = new BSTNode(value); 
            } else { 
                this.right.insert(value); 
            } 
        } 
    } 
    public void preOrder() { 
        System.out.print(this.info + " "); 
        if (this.left != null) { 
            this.left.preOrder(); 
        } 
        if (this.right != null) { 
            this.right.preOrder(); 
        } 
    } 
    public void inOrder() { 
        if (this.left != null) { 
            this.left.inOrder(); 
        } 
        System.out.print(this.info + " "); 
        if (this.right != null) { 
            this.right.inOrder(); 
        } 
    } 
    public void postOrder() { 
        if (this.left != null) { 
                                                                                                   
            this.left.postOrder(); 
        } 
        if (this.right != null) { 
            this.right.postOrder(); 
        } 
        System.out.print(this.info + " "); 
    } 
} 
public class BstNode { 
    public static void main(String[] args) { 
        BSTNode root = new BSTNode(10); 
        root.insert(5); 
        root.insert(15); 
        root.insert(3); 
        root.insert(7); 
        root.insert(12); 
        root.insert(18); 
        System.out.println("Pre-order traversal:"); 
        root.preOrder(); 
        System.out.println("\nIn-order traversal:"); 
        root.inOrder(); 
        System.out.println("\nPost-order traversal:"); 
        root.postOrder(); 
    }
}