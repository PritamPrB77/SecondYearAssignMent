package AssignMent_chapter_17;

import java.util.Arrays;

class node{
	private int value;private  node leftc; private node rightc;
	node(int value){
		this.value=value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public node getLeftc() {
		return leftc;
	}
	public void setLeftc(node leftc) {
		this.leftc = leftc;
	}
	public node getRightc() {
		return rightc;
	}
	public void setRightc(node rightc) {
		this.rightc = rightc;
	}
}

public class createBSTFromArray{
	private node root;
	public void CreateBinaryTree(int arr[]) {
		
		root=CreateBinaryTree(arr,0,arr.length-1);
	}

	public node CreateBinaryTree(int arr[],int st,int end) {
		node curr=null;
		if(st>end) return null;// when single elm it return null
		int mid=(st+end)/2;// find the child node
		curr=new node(arr[mid]);// create a node 
		curr.setLeftc(CreateBinaryTree(arr,st,mid-1));// left child of curr child set to that node
		curr.setRightc(CreateBinaryTree(arr,mid+1,end));// Right child of curr child set to that node
		return curr;// return the curr created node
	}
 

	public  void InOrder(node node) {
		if (node != null) {
			InOrder(node.getLeftc());
			System.out.print("||" + node.getValue());
			InOrder(node.getRightc());
		}
	}
	
	public boolean isBST() {
		return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
				
	}
	
	public boolean isBST(node curr,int min,int max) {
		if(curr==null) {
			return true;
		}
		if(curr.getValue()<min||curr.getValue()>max) {
			return false;
		}
		return isBST(curr.getLeftc(),min,curr.getValue()) && isBST(curr.getRightc(),curr.getValue(),max);
	}
	
	
	public static void main(String[]args) {
		createBSTFromArray s1=new createBSTFromArray();
	int arr[]= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	Arrays.sort(arr);
	System.out.println("Balanced BST:  ");
	s1.CreateBinaryTree(arr);
	s1.InOrder(s1.root);
	
	System.out.println("Check BST Or not:: "+s1.isBST());
	}
	
	
}

