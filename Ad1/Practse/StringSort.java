package Practse;

import java.util.Arrays;

public class StringSort {
    public static  void SelectionSort(String []arr){

        for (int i = 0; i < arr.length; i++) {
            int minIdx=i;

            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j].compareTo(arr[minIdx])<0){
                    minIdx=j;
                }
            }
            String temp=arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=temp;

        }

    }

    public static void main(String[] args) {
        String arr[]={"apple","banana","orange","applo","abble"};
        SelectionSort(arr);



//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        for(String i:arr){
            System.out.print(i+" ");
        }
        Arrays.toString(arr);
        System.out.println();
    }
}
