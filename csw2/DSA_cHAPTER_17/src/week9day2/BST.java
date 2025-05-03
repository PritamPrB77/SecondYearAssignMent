package week9day2;

import java.util.Arrays;

public class BST {
	private node root;

	public void InsertNode(int value) {
		root = InsertNode(root, value);
	}

	public node InsertNode(node node, int value) {
		if (node == null) {
			node = new node(value);
		} else {
			if (node.getValue() > value) {
				node.setLeftc(InsertNode(node.getLeftc(), value));
			} else {
				node.setRightc(InsertNode(node.getRightc(), value));
			}
		}
		return node;
	}

	public  void PreOrder(node node) {
		if (node != null) {
			System.out.print("||" + node.getValue());
			PreOrder(node.getLeftc());
			PreOrder(node.getRightc());
		}
	}

	public  void InOrder(node node) {
		if (node != null) {
			InOrder(node.getLeftc());
			System.out.print("||" + node.getValue());
			InOrder(node.getRightc());
		}
	}

	public  void PostOrder(node node) {
		if (node != null) {
			PostOrder(node.getLeftc());
			PostOrder(node.getRightc());
			System.out.print("||" + node.getValue());

		}
	}

	public boolean Find(int value) {
		node curr=root;
		while(curr!=null) {
			if(curr.getValue()==value) {
				return true;
			}
			else if(curr.getValue()>value) {
				curr=curr.getLeftc();
			}
			else {
				curr=curr.getRightc();
			}
		}
		return false;
	}

	public boolean Search(node curr,int value) {
             if(curr==null) {
            	 return false;
             }
		
			if(curr.getValue()==value) {
				return true;
			}
			else if(curr.getValue()>value) {
				return Search(curr.getLeftc(),value);
			}
			else {
				return Search(curr.getRightc(),value);
			}
			
		}
	
	public int FinMin() {
		node curr=root;
		if(curr==null) {
			return Integer.MAX_VALUE;
		}
	
		while(curr.getLeftc()!=null) {
			curr=curr.getLeftc();
		}
		return curr.getValue();
	}
	
	public int FinMax() {
		node curr=root;
		if(curr==null) {
			return Integer.MIN_VALUE;
		}
	
		while(curr.getRightc()!=null) {
			curr=curr.getRightc();
		}
		return curr.getValue();
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
	
	public  void createNode(BST t1) {
		t1.InsertNode(40);
		t1.InsertNode(20);
		t1.InsertNode(30);
		t1.InsertNode(60);
		t1.InsertNode(70);
		t1.InsertNode(10);
		t1.InsertNode(50);

	}
 
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
	
	// is is not the Reverse but print in AntiClockWise
	public  void ConverseInOrder(node node) {
		if(node!=null) {
			ConverseInOrder(node.getRightc());
			System.out.print("||" + node.getValue());
			ConverseInOrder(node.getLeftc());
			
		}
	}
	// is is not the Reverse but print in AntiClockWise
	public  void ConversePostOrder(node node) {
		if(node!=null) {
			ConversePostOrder(node.getRightc());
			ConversePostOrder(node.getLeftc());
			System.out.print("||" + node.getValue());
			
		}
	}
	// is is not the Reverse but print in AntiClockWise
	
	public  void ConversePreOrder(node node) {
		if (node != null) {
			System.out.print("||" + node.getValue());
			ConversePreOrder(node.getRightc());
			ConversePreOrder(node.getLeftc());
			
		}
	}
	
	public void delete(int data) {
		root=delete(root,data);
//		System.out.println("   ccdv"+root.getValue());
	}
	
	public  node delete(node curr,int data) {
		
		if(curr.getValue()<data) {
			curr.setRightc(delete(curr.getRightc(),data));
		}
		else if(curr.getValue()>data) {
			curr.setLeftc(delete(curr.getLeftc(),data));
		}
		else {
			//case1 no children present
			if(curr.getLeftc()==null && curr.getRightc()==null) {
				return null;
			}
			//case2 only one child present
			else if(curr.getLeftc()==null) return curr.getRightc();
			else if(curr.getRightc()==null) return curr.getLeftc();
			//case3 both right and leftChildPresent
			node temp=FindInorderSucessor(curr.getRightc());
			curr.setValue(temp.getValue());
			//System.out.println(temp.getValue());
            curr.setRightc(delete(curr.getRightc(),temp.getValue()));
		}
		return curr;
		
	}
	
	 public   node FindInorderSucessor(node root ){
	        while(root.getLeftc()!=null){
	            root=root.getLeftc();
	        }
	        return root;
	     }
	
	public static void main(String[] args) {
		BST s1 = new BST();
		s1.createNode(s1);

		System.out.println(" PreOreder Traversal");
		s1.PreOrder(s1.root);
		System.out.println("\n InOreder Traversal ");
		s1.InOrder(s1.root);
		System.out.println("\n PostOreder Traversal ");
		s1.PostOrder(s1.root);
		System.out.println("Checking elem present or not");
		System.out.println("10 exit "+s1.Find(10));
		System.out.println("70 exit "+s1.Find(70));
		System.out.println("100 exit "+s1.Find(100));
		
		System.out.println("Checking elem present or not");
		System.out.println("10 exit "+s1.Search(s1.root,10));
		System.out.println("70 exit "+s1.Search(s1.root,70));
		System.out.println("100 exit "+s1.Search(s1.root,100));
		
		System.out.println("Minimumn Value is  "+s1.FinMin());
		System.out.println("Maximum  Value is  "+s1.FinMax());
		System.out.println("Check BST Or not "+s1.isBST());
		
		int arr[]= {4,2,3,6,7,1,5};
		Arrays.sort(arr);
		System.out.println("Balanced BST:  ");
		s1.CreateBinaryTree(arr);
		
		System.out.println(" PreOreder Traversal");
		s1.PreOrder(s1.root);
		System.out.println("\n InOreder Traversal ");
		s1.InOrder(s1.root);
		System.out.println("\n PostOreder Traversal ");
		s1.PostOrder(s1.root);
		System.out.println("\nprinting  in AntiClockWise");
		
		System.out.println(" ConversePreOreder Traversal");
		s1.ConversePreOrder(s1.root);
		System.out.println("\n ConverseInOreder Traversal ");
		s1.ConverseInOrder(s1.root);
		System.out.println("\n ConversePostOreder Traversal ");
		s1.ConversePostOrder(s1.root);
		System.out.println("\n InOreder Traversal ");
		s1.InOrder(s1.root);
		System.out.println("\n Deleting start");
		   s1.delete(4);
		System.out.println("\n InOreder Traversal ");
		s1.InOrder(s1.root);
		s1.delete( 3);
		System.out.println("\n InOreder Traversal ");
		s1.InOrder(s1.root);
	}

}
