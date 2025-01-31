package cswBITWISE;

import java.util.Arrays;

public class kthlargandkthSmall {
    public static  void max(int arr[]){

    }

    public static void kthLargesr(int arr[],int k){
        int crr[]=arr;int c=k;int max=crr[0];
        for(int i=0;i<crr.length;i++){
            if(crr[i]>max){
               max=crr[i];
            }
            c=0;
        }
        //if()

    }
    public static  void kthlargeSmall(int arr[],int k){
        Arrays.sort(arr);//nlogn
        System.out.println(k+"th largest is"+arr[arr.length-k]);
        System.out.println(k+"th smallest is"+arr[0+(k-1)]);
    }
    public static void main(String[] args) {
   int arr[]={1,2,3,4,5,6,7};
   kthlargeSmall(arr,3);
    }
}
