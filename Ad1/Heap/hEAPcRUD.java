package Heap;

import java.util.Scanner;

public class hEAPcRUD {
    static  int Idx=0;
    static  int size=8;
    //static  int arr[]=new int[size];
    public static  void MINhEAPIFY(int arr[],int i,int size){
        int mixIdx=i;
           if(2*i+1>=size) return;
           else if(2*i+1==size-1) mixIdx=2*i+1 ;
           else {
               int left=2*i+1,right=2*i+2;
               if(arr[mixIdx]<arr[left]){
                   mixIdx=left;
               }
               if(arr[mixIdx]<arr[right]){
                   mixIdx=right;
               }
           }
           if(i!=mixIdx){
               int temp=arr[i];
               arr[i]=arr[mixIdx];
               arr[mixIdx]=temp;
               MINhEAPIFY(arr,mixIdx,size);;
           }
    }

    public  static  void heapify(int arr[],int i,int size){
      //  System.out.println(size);
        int left=2*i+1;
        int right=2*i+2;
        int MaxIdx=i;
        if(left<size&&arr[MaxIdx]>arr[left]){
            MaxIdx=left;
        }
        if(right<size&&arr[MaxIdx]>arr[right]){
            MaxIdx=right;
        }
        if(i!=MaxIdx){
            int temp=arr[i];
            arr[i]=arr[MaxIdx];
            arr[MaxIdx]=temp;
            heapify(arr,MaxIdx,size);
        }
    }

    public static  int peek(int arr[]){return  arr[0];}
    public static void insert(int arr[],int data,int size){
      if(Idx==size ) return;
        arr[Idx]=data;

          int x=Idx;
     //   System.out.println(data);

//        System.out.println(arr[Idx]);
        int parent=(x-1)/2;
        while(arr[parent]>arr[x]){
            int temp=arr[x];
            arr[x]=arr[parent];
            arr[parent]=temp;
            x=parent;
            parent=(x-1)/2;
        }
        Idx+=1;
    }
    public static int remove(int arr[]){
       if(size==-1){
           System.out.println("UnderFow Error OCcur");
           return -1;

       }
        int x=arr[0];
       arr[0]=arr[size-1];
       arr[size-1]=x;
        size-=1;

    // MINhEAPIFY(arr,0,size);
//          heapify(arr,0,size);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

       return x;
    }

    public static  void HeapSort(int []arr,int size){
        //BUild Heap
        for(int i=size/2;i>=0;i--){
            MINhEAPIFY(arr,i,size);
//    heapify(arr,0,size);
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=size-1;i>=1;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            size-=1;
         //   System.out.println(size);
           MINhEAPIFY(arr,0,size);
   //heapify(arr,0,size);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int size=5;
      //  int arr[]=new int [size];
        //System.out.println("enter element");
       // for(int i=0;i< arr.length;i++)arr[i]=sc.nextInt();
//        insert(arr,45,size);
//        insert(arr,35,size);
//        insert(arr,25,size);
//        insert(arr,15,size);
//        insert(arr,5,size);
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        System.out.println(   remove(arr));
//      //  System.out.println(size);
//        System.out.println(   remove(arr));
        int crr[]={9,8,7,6,5,1,2,4};
        HeapSort(crr,size);
        for(int i:crr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
