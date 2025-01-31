package TREE;

import java.util.LinkedList;
import java.util.Queue;

public class btree {
    //creating linkedlist for binary trree
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    ///building the binary tree from an array
    static  class BinaryTree{
        static  int idx=-1;

        public static node buIldTree(int nodes[]){

            idx++;
            if (nodes[idx]==-1){
                return  null;
            }

            node newNode=new  node( nodes[idx]);
            newNode.left=buIldTree(nodes);
            newNode.right=buIldTree(nodes);
            return newNode;
        }

    }
    ///prerder traversing
    public  static  void preOrder(node root){
        if(root==null){
          //  System.out.println();

            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static  void INorder(node root){
        if(root==null){
            return;
        }
        INorder(root.left);
        System.out.print(root.data+" ");
        INorder(root.right);
    }
    public static  void PostOrder(node root){
        if(root==null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static  void LavelOrder(node root){
        if (root==null){
            return;
        }
        Queue <node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            node currnode=q.remove();
            if(currnode==null){
                System.out.println();
               // System.out.println("/" +" "+"\\");
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currnode.data+" ");
                if(currnode.left!=null){
                    q.add(currnode.left);
                }
                if(currnode.right!=null){
                    q.add(currnode.right);
                }
            }
        }
    }
    public static  int HeightOfTree(node root){
        if(root==null){
            return 0;
        }
//        int leftSubtreeHeight=HeightOfTree(root.left);
//        int ritSubtreeHeight=HeightOfTree(root.right);
//        return  Math.max(leftSubtreeHeight,ritSubtreeHeight)+1;
        return (Math.max(HeightOfTree(root.left),HeightOfTree(root.right))+1);
    }
    public static  int countOfNodes(node root){
        if(root==null){
            return 0;
        }
        int lh=countOfNodes(root.left);
        int rh=countOfNodes(root.right);
        return lh+rh+1;

    }
    public  static  int SumOfNodes(node root){
        if(root==null){
            return 0;
        }
        int lsum=SumOfNodes(root.left);
        int rSum=SumOfNodes(root.right);
        return  lsum+rSum+root.data;
    }
    public static  int Diameter(node root){
        if(root==null){
            return 0;
        }
        int leftDiam= Diameter(root.left);
        int leftHeight=HeightOfTree(root.left);
        int RightDiam= Diameter(root.right);
        int RightHeight=HeightOfTree(root.right);
        int selfDiam=leftHeight+RightHeight+1;
        return  Math.max( selfDiam,Math.max(leftDiam,RightDiam));
         //since its TimeComplexity is O(n^2) we use effectively way
        //it have two cases either diam passes through root node
        // or diameter passses through left subtrre or Right Subtree
        //The most Efficient way is Diameter2

        }
     public  static  class info {
         int ht;
         int diam;
         public info(int diam, int ht) {
             this.diam = diam;
             this.ht = ht;
         }
     }
    public static  info Diameter2(node root){
        if(root==null){
            return new info(0,0);
        }
        info leftInfo=Diameter2(root.left);
       info rightINFO=Diameter2(root.right);
       int diam=Math.max(Math.max(leftInfo.diam,rightINFO.diam),leftInfo.ht+rightINFO.ht+1);
       int ht=Math.max(leftInfo.ht, rightINFO.ht)+1;
       return  new info(diam,ht);
       ///time complexity o(n);
    }
    //subtree of another tree
    public static boolean isIdentical(node root,node subroot){
        if(root==null&&subroot==null){
            return true;
        }
        else if(root==null ||subroot==null||root.data != subroot.data){
            return false;
        }
        if(!isIdentical(root.left, subroot.left)) return false;
        if(!isIdentical(root.right, subroot.right)) return false;
        return true;

    }
    public static  boolean isSubtree(node root,node subroot){
     if(root==null){
         return false;
         //it return false if node doesnt exit
     }
     if(root.data==subroot.data){
         if(isIdentical(root,subroot)){
             return true;
         }
     }
     return  isSubtree(root.left,subroot)||isSubtree(root.right,subroot);
    }
    //kth lavel of tree

    public static void kLavel(node root,int lavel,int k){
        if(root==null) return;
        if(lavel==k){
            System.out.print(root.data+" ");
            return;
        }
        kLavel(root.left, lavel+1, k);
        kLavel(root.right, lavel+1, k);
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,3,-1,-1,5,6,-1,-1,7,-1,8,-1,-1};
        /*
          1
       2    5
      4 3  6 7
               8
        */

        BinaryTree s1=new BinaryTree();
       node root= BinaryTree.buIldTree(nodes);
        System.out.println(root.data);
        preOrder(root);
        System.out.println();
        INorder(root);
        System.out.println();
        PostOrder(root);
        System.out.println();
        System.out.println("-------|");
        LavelOrder(root);
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("height of tree is: "+HeightOfTree(root));
        System.out.println("count of tree us: "+countOfNodes(root));
        System.out.println("sum of all nodes in the tree is: "+SumOfNodes(root));
        System.out.println("diameter of node is: "+Diameter(root));
        System.out.println("diameter od node is: "+Diameter2(root).diam);

        /*
        checking for subtree
        2
       4  3
         */
        node subroot1=new node(2);
        subroot1.left=new node(4);
        //subroot1.right=new node(3);
        //preOrder(root1);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("is subtree contains: "+isSubtree(root,subroot1));
        kLavel(root,0,2);

    }
}
