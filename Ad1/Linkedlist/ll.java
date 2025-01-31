package Linkedlist;



public class ll {
    static class node{
        node next;
        int data;
        node(int data){
            this.next=null;
            this.data=data;
        }
    }
    static node start=null;
    public static void createll(int data) {
        node nwnode=new node(data);
        if(start==null) {
            start=nwnode;
            start.next=null;
        }
        else {
            node temp=start;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=nwnode;
            nwnode.next=null;
        }


    }
    public static void traverse() {
        if(start==null) {
            System.out.println("ll not exit");
        }
        else {
            node temp=start;
            while(temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }


    }
    public static int count() {
        int count=0;
        if(start==null) {
            System.out.println("ll not exit");
            count=0;
        }
        else {
            node temp=start;
            while(temp!=null) {
                System.out.print(temp.data+" ");
                count++;
                temp=temp.next;
            }
            System.out.println();
        }

        return count;
    }
    public static void insertfst(int data) {
        node nwnode=new node(data);
        if(start==null) {
            start=nwnode;
            start.next=null;
        }
        else {

            nwnode.next=start;
            start=nwnode;

        }


    }
    public static  void inslast(int data) {
        node nwnode=new node(data);
        if(start==null) {
            start=nwnode;
            start.next=null;
        }
        else {
            node temp=start;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=nwnode;
            nwnode.next=null;
        }

    }
    public static void inMiddle(int data,int k) {
        node nwnode=new node(data);
        if(start==null) {
            start=nwnode;
            start.next=null;
            return;
        }
        if(k==1) {
            insertfst( data);
        }
        else if(k==count()) {
            inslast(data);
        }

        else {
            node temp=start;
            node temp1=temp.next;
            for(int i=1;i<k-1;i++) {
                temp=temp.next;
                temp1=temp1.next;
            }
            temp.next=nwnode;
            nwnode.next=temp1;
        }
    }

    public  static void DeleteKth(int k) {
        if(start==null) {
            System.out.println("delete not possible Underflow Occur");
        }
        else {
            node temp=start;
            node temp1=temp.next;
            for(int i=1;i<k-1;i++) {
                temp=temp.next;
                temp1=temp1.next;
            }
            temp.next=temp1.next;
        }
    }

    public static void REMOveDupll(){
        node curr1=start;
        node curr2=start.next;
        while(curr1.next!=null){
            curr2=curr1.next;
            node temp=curr1;
            while(curr2.next!=null){
             if(curr1.data==curr2.next.data){


                   // curr1.next=curr2.next;
                     temp.next.next=curr2.next.next;


                }

                curr2=curr2.next;

            }
            curr1=curr1.next;
        }
    }
    static void reverseList() {

        // Initialize three pointers: curr, prev and next
        node curr = start, prev = null, next;

        // Traverse all the nodes of Linked List
        while (curr != null) {

            // Store next
            next = curr.next;

            // Reverse current node's next pointer
            curr.next = prev;

            // Move pointers one position ahead
            prev = curr;
            curr = next;
        }

        // Return the head of reversed linked list
        start=prev;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        createll(23);
        createll(2);
        createll(123);

        createll(3);
        createll(234);
        createll(123);
        createll(123);

        createll(123);
        createll(123);
        createll(123);


        traverse();
//        insertfst(45);
//        traverse();
//        inMiddle(3456,4);
//        traverse();
//        DeleteKth(4);
//        traverse();
        REMOveDupll();
        traverse();
        reverseList();
        traverse();
    }

}

