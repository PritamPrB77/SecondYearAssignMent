package cswBITWISE;

import java.util.Scanner;

public class maxminUSERwant {
   public static  void  findMAxmin(int arr[]){
       int max=arr[0];int min=arr[0];

       for(int j:arr){
           System.out.print(j);
       }
       System.out.println();
       {
           for(int i=0;i<arr.length;i++){
               if(arr[i]>max){
                   max=arr[i];
               }
               if(arr[i]<min){
                   min=arr[i];
               }
           }
       }
       System.out.println("max is"+max);
       System.out.println("min is"+min);
   }

    public static void maxmin(){
        String str="";
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int x=1;int i=0;
        while(x==1){
            if(i== arr.length){
                break;
                // arr=new int[arr.length*2];
            }
            System.out.println("enter NUmber want to add");
        //  str+= str+sc.nextInt();
            arr[i]=sc.nextInt();
            i=i+1;


            System.out.println("want to addNUmber press 1 else press 0");
            x=sc.nextInt();
//            if (x ==0) {
//                findMAxmin(arr);
//            }
        }
        findMAxmin(arr);
    }
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       ///we took Prompt As User like
        System.out.println("enter The size of eleement you want to add");
        int arr[]=new int[sc.nextInt()];
        System.out.println("eter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
       maxmin();
    }
}
