package leetCode;

import java.util.ArrayList;

public class Arrayleader {
    static ArrayList<Integer> leaders(int n, int arr[]) {

        // Your code here
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ArrayList<Integer> br = new ArrayList<Integer>();

        int tLeader=arr[arr.length-1];

        ar.add(tLeader);

        for(int i=arr.length-2;i>=0;i--){

            if(arr[i]>tLeader){
                ar.add(arr[i]);

                tLeader=arr[i];
            }
        }
//          br= (ArrayList<Integer>) ar.reversed(); //we newwd To Cast Arraylist Integer
        System.out.println(ar.size());
     for (int i=ar.size()-1;i>=0;i--){
         System.out.println(ar.get(i));
        br.add(ar.get(i));
     }
     return br;

    }

    public static void main(String[] args) {
        int arr[]={16 ,17 ,4, 3 ,5 ,2};
        ArrayList<Integer> ar=new ArrayList<>();
        ar=leaders(6,arr);
        System.out.println(ar);
    }
}
