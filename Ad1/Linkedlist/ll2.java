package Linkedlist;

public class ll2 {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online


/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

    public class Main
    {
        static class node{
            node next;
            node prev;
            int data;
            public node(int data){
                this.data=data;
            }
        }
        static node head=null;
        static node tail=null;

        public static void createll(int data){
            node nwnode=new node(data);
            if(head==null){
                head=tail=nwnode;
            }
            else{
                tail.next=nwnode;
                nwnode.prev=tail;
                tail=nwnode;
                tail.next=null;
            }
        }
        public static void traverse(){

            if(head==null){
                System.out.println("ll not exit");
                return;
            }
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;

            }
            System.out.println();

        }
        public static void insfst(int data){
            node nwnode=new node(data);
            if(head==null){
                head=tail=nwnode;
            }
            else{
                nwnode.next=head;
                head.prev=nwnode;
                head=nwnode;
                head.prev=null;
            }
        }
        public static void inslast(int data){
            node nwnode=new node(data);
            if(head==null){
                head=tail=nwnode;
            }
            else{
                nwnode.prev=tail;
                tail.next=nwnode;
                tail=nwnode;
                tail.next=null;

            }
        }
        public static void insatATKTH(int data,int k){
            node nwnode=new node(data);

            if(head==null){
                head=tail=nwnode;
            }
            else{
                node curr=head;
                node currnext=head.next;
                for(int i=1;i<k-1;i++){
                    curr=curr.next;
                    currnext=currnext.next;
                }
                nwnode.next=currnext;
                currnext.prev=nwnode;
                nwnode.prev=curr;
                curr.next=nwnode;
            }
        }
        public static void Reverse(){
            node curr=head;
            node prev=null;
            node next=null;

            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                prev=curr;
                curr=next;

            }
            head=prev;
        }

        public static void  deletefst(){
            if(head==null){
                System.out.println("ll not exit");
            }
            else{
                head=head.next;
                head.prev=null;
            }
        }
        public static void  deletelst(){
            if(tail==null){
                System.out.println("ll not exit");
                return;
            }
            else{
                tail=tail.prev;
                tail.next=null;
            }
        }
        public static void DEleteATMIdle(int k){
            if(head==null){
                System.out.println("ll not exit");
            }
            else{
                node curr=head;
                node currnext=curr.next;
                for(int i=1;i<k-1;i++){
                    curr=curr.next;
                    currnext=currnext.next;
                }
                curr.next=currnext.next;
                currnext.next.prev=curr;
            }
        }


        public static void Squareelem(int arr[]){
            for(int i=0;i<arr.length;i++){
                arr[i]=arr[i]*arr[i];
            }
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();

        }
        public static void Squareelemll(){
            if(head.next==null){

                head.data=(int)Math.pow(head.data,2);
            }
            else{
                node temp=head;
                while(temp!=null){
                    temp.data=(int)Math.pow(temp.data,2);
                    temp=temp.next;
                }
            }

        }


        public static void main(String[] args) {
            System.out.println("Welcome to Online IDE!! Happy Coding :)");
            createll(35);
            createll(45);
            inslast(78);
            insfst(29);
            insfst(299);
            insatATKTH(1,2);
            traverse();
            Reverse();
            traverse();
            deletefst();
            traverse();
            // deletelst();
            // traverse();
            DEleteATMIdle(2);
            traverse();
            int arr[]={1,4,9,16,25};
            Squareelem(arr);
            Squareelemll();
            //  traverse();
            //  deletelst();
            traverse();
        }
    }

}
