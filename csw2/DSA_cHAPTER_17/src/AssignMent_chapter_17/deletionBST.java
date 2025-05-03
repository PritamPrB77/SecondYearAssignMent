package AssignMent_chapter_17;



class TreeNode{
int val; 
TreeNode left, right; 
TreeNode(int key) { 
    val = key; 
    left = right = null; 
} 
} 
 public class deletionBST { 
TreeNode root; 
public void insert(int key) { 
    root = insertRec(root, key); 
} 
private TreeNode insertRec(TreeNode node, int key) { 
    if (node == null) { 
        return new TreeNode(key); 
    } 
    if (key < node.val) { 
        node.left = insertRec(node.left, key); 
    } else { 
        node.right = insertRec(node.right, key); 
    } 
    return node; 
} 
public void delete(int key) { 
    root = deleteRec(root, key); 
} 
private TreeNode deleteRec(TreeNode node, int key) { 
    if (node == null) return null; 
    if (key < node.val) { 
        node.left = deleteRec(node.left, key); 
    } else if (key > node.val) { 
        node.right = deleteRec(node.right, key); 
    } else { 
        if (node.left == null) return node.right; 
        if (node.right == null) return node.left; 
        node.val = minValueNode(node.right).val; 
        node.right = deleteRec(node.right, node.val); 
    } 
    return node; 
} 
private TreeNode minValueNode(TreeNode node) { 
    while (node.left != null) { 
        node = node.left; 
    } 
    return node; 
} 
public void inorder() { 
    inorderRec(root); 
    System.out.println(); 
} 
private void inorderRec(TreeNode node) { 
    if (node != null) { 
        inorderRec(node.left); 
        System.out.print(node.val + " "); 
        inorderRec(node.right); 
    } 
} 
public static void main(String[] args) { 
	deletionBST bst = new deletionBST(); 
    bst.insert(50); 
    bst.insert(30); 
    bst.insert(20); 
    bst.insert(40); 
    bst.insert(70); 
    bst.insert(60); 
    bst.insert(80); 
    System.out.println("Inorder traversal before deletion:"); 
    bst.inorder(); 
    bst.delete(20); 
    System.out.println("Inorder traversal after deleting 20:"); 
    bst.inorder(); 
    bst.delete(30); 
    System.out.println("Inorder traversal after deleting 30:"); 
    bst.inorder(); 
    bst.delete(50); 
    System.out.println("Inorder traversal after deleting 50:"); 
    bst.inorder(); 
} 
} 

