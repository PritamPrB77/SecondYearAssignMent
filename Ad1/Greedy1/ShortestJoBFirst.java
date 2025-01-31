package Greedy1;

import java.util.Arrays;

public class ShortestJoBFirst {
      public  static  double  ShortestJobFirst( int arr[]){
          Arrays.sort(arr);
          int t=0,wt=0;
          for(int i=0;i<arr.length;i++){
              wt+=t;
              t=t+arr[i];

          }
          return  wt/ arr.length;
      }
    public static void main(String[] args) {
        int arr[]={4,3,7,1,2};
        System.out.println(ShortestJobFirst(arr));
    }
}
