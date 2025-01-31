package TREE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bst2 {
    static class node{
        node left;node right;
        int data;
        node(int data){
            this.data=data;
        }
    }
    //Arrat to BSt
    public static node CreateBSt(int arr[],int st,int end){
        if(st>end) return null;
        int mid=(st+end)/2;
        node root=new node(arr[mid]);
        root.left=CreateBSt(arr,st,mid-1);
        root.right=CreateBSt(arr,mid+1,end);
        return root;
    }
    public  static void InOrder(node root){
        if(root==null) {
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }
    //convert BSt to BALANCed BSt
    public static node CreateBSttt(ArrayList<Integer> arr,int st,int end){
        if(st>end) return null;
        int mid=(st+end)/2;
        node root=new node(arr.get(mid));
        root.left=CreateBSttt(arr,st,mid-1);
        root.right=CreateBSttt(arr,mid+1,end);
        return root;
    }
    public static  void getInorder(node root,ArrayList<Integer> arr){
        if(root==null) return;
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }
    public static  node BalancedBSt(node root){
        ArrayList<Integer> inorder=new ArrayList<>();
        getInorder(root,inorder);
        root=CreateBSttt(inorder,0,inorder.size()-1);
        return root;
    }
    public static void main(String[] args) {
        System.out.println("enter size:->");
        Scanner sc=new Scanner(System.in);
           int arr[]=new int[sc.nextInt()];
           for(int i=0;i<arr.length;i++){
               arr[i]=sc.nextInt();
           }
        Arrays.sort(arr);
          node root= CreateBSt(arr,0,arr.length-1);
           InOrder(root);
        System.out.println();
        System.out.println(root.data);
        System.out.println("/////////////////////////////////////");
        node root1=new node(8);
        root1.left=new node(6);
        root1.right=new node(10);
        root1.left.left=new node(5);
        root1.right.right=new node(11);
        root1.left.left.left=new node(3);
        root1.right.right.right=new node(12);

      root1=  BalancedBSt(root1);
      InOrder(root1);
        System.out.println();
        System.out.println(root1.left.right.data);
    }
}
