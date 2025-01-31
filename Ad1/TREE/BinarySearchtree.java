package TREE;

import java.util.ArrayList;

public class BinarySearchtree {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
        }
    }
    //creating a binary treee
    public static  node insert(node root,int data){
        if(root==null){
            root=new node(data);
            return  root;

        }if(root.data>data){
            root.left=insert(root.left, data);
        }else{
            root.right=insert(root.right, data);
        }
        return root;

    }
    //inorder traversal of binary tree
    public static void inorder(node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //search in a BST
    public static  boolean search(node root,int key){
        if(root==null) return false;
        if(root.data==key){
            return true;
        }
        if(root.data>key) return search(root.left,key);

        else return  search(root.right, key);
    }
    public static node deleteBstNode(node root,int val){
        if(root.data<val){
            root.right=deleteBstNode(root.right,val);
        }
        else if(root.data>val){
            root.left=deleteBstNode(root.left,val);

        }
        else{
            //case1
            if(root.left==null&&root.right==null){
                return null;
            }
            //if one children available
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;

            node Is=FindInorderSucessor(root.right);
            root.data=Is.data;
            deleteBstNode(root.right, Is.data);
        }
        return root;
    }
     public  static node FindInorderSucessor(node root ){
        while(root.left!=null){
            root=root.left;
        }
        return root;
     }
//print the number of nodes in a range
    public static void printInRange(node root ,int k1,int k2) {
        if(root==null) return;
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
        }
        else if(root.data<k1) printInRange(root.left, k1, k2);
        else printInRange(root.right,k1,k2);
    }
    //print all the node data from root to leaf
    public static  void PrintPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
    public static  void printRooot2Leaf(node root,ArrayList<Integer> path){
        if(root==null) return;
        path.add(root.data);
        if(root.left==null &&root.right==null) PrintPath(path);
        printRooot2Leaf(root.left, path);
        printRooot2Leaf(root.right, path);
        path.remove(path.size()-1);

    }
    //validate the BSt
    public static  boolean IsValidBst(node root,node min,node max) {
        if(root==null) return  true;
        if(min!=null &&root.data<= min.data){
            return false;
        }
        else if(max!=null && root.data>= max.data) return false;
    return  IsValidBst(root.left, min, root) && IsValidBst(root.right,root , max);

    }

    //Mirror a Bst
    public static node CreateMirror(node root){
        if(root==null) return null;
        node LeftMirror=CreateMirror(root.left);
        node RightMirror=CreateMirror(root.right);
        root.left=RightMirror;
        root.right=LeftMirror;
        return root;
    }

    public static void main(String[] args) {
        int values []= {5,1,3,4,2,7};
        node root=null;
        for(var i:values){
            root=insert(root,i);
        }
        inorder(root);
        System.out.println();
        System.out.println("key is available :"+search(root,411));
        root=deleteBstNode(root,1);
        inorder(root);
        System.out.println();
        printInRange(root,4,7);
        System.out.println();
        //create an array lsist
        ArrayList<Integer> path=new ArrayList<>();
        printRooot2Leaf(root,path);
        if(IsValidBst(root,null ,null)) System.out.println("Bst is correct");
        else System.out.println("not correct");
        //Mirroring BST
        root=CreateMirror(root);
        inorder(root);
    }
}
