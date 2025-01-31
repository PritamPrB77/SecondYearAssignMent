package Heap;

import java.util.ArrayList;

public class MaxHeapCrud {
    static  class MaxHeap{
        ArrayList<Integer> arr=new ArrayList<>();
        ///Min Heap Implementation
        public void add(int data){
            arr.add(data);
            int x=arr.size()-1;//x is child Index
            int par=(x-1)/2;//Parent idx
            while(arr.get(x)>arr.get(par)){//o(logn)
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
                par= (x-1)/2;
            }
        }
        public  int peek(){
            return arr.get(0);
        }
        private   void Heapify(int i){
            ///to fix All the heaps we use it
            int left=2*i+1;
            int right=2*i+2;
            int maxIDX=i;
            if(left<arr.size()&&arr.get(maxIDX)<arr.get(left)){
                maxIDX=left;
            }
            if(right<arr.size()&&arr.get(maxIDX)<arr.get(right)){
                maxIDX=right;
            }
            if(maxIDX!=i){
                int temp=arr.get(i);
                arr.set(i, arr.get(maxIDX));
                arr.set(maxIDX,temp);
                Heapify(maxIDX);
                // return;in void that  return have doesnt impact on  weather it to
                //write or not write
            }

        }
        public int remove(){
            int data=arr.get(0);
            //step-1->Swap fast And Last
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            //step2->Delete last
            arr.remove(arr.size()-1);
            //Step3-->Heapify/ReArrange The Values
            Heapify(0);
            return  data;
        }
        public    boolean isEmpty(){
            return  arr.size()==0;
        }
    }

    public static void main(String[] args) {
       // Heap.MinHeapCRUD.Heap h1=new Heap.MinHeapCRUD.Heap();
        MaxHeap h1=new MaxHeap();
        h1.add(0);
        h1.add(6);
        h1.add(-87);
        h1.add(64);
        h1.add(3);
        System.out.println(h1.arr);

        while(!h1.isEmpty()){
            System.out.println(h1.peek());
            h1.remove();
            System.out.println(h1.arr);
        }
    }
}
