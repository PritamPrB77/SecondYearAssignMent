package Heap;

public class HeapSort {
    public  static  void heapify(int arr[],int i,int size){
        int left=2*i+1;
        int right=2*i+2;
        int MaxIdx=i;
        if(left<size&&arr[MaxIdx]<arr[left]){
            MaxIdx=left;
        }
        if(right<size&&arr[MaxIdx]<arr[right]){
            MaxIdx=right;
        }
        if(i!=MaxIdx){
            int temp=arr[i];
            arr[i]=arr[MaxIdx];
            arr[MaxIdx]=temp;
            heapify(arr,MaxIdx,size);
        }
    }
    public  static  void Heapsort(int arr[]){
        //step-1->BuildMaxHeap
        int n=arr.length;
        for (int i = n/2; i >=0; i--) {
            heapify(arr,i,n);
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        //Step2-->pushLargest And Build
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,0,i);
            for (int j:arr){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       int arr[]={1,2,4,5,3};
       Heapsort(arr);
       for (int i:arr){
           System.out.print(i+" ");
       }
        System.out.println();
    }
}
