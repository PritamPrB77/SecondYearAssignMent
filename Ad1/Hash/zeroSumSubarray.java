package Hash;

import java.util.HashMap;
import java.util.HashSet;

public class zeroSumSubarray {
    /*
    is  in an array  there exit some subarray whose sum=0;
    print the largest subarray
     */

    static  int zerosumsubarry(int arr[]){
        int maxlength=0;
        HashMap<Integer,Integer>mp =new HashMap<>();
        int prefixsum=0;
        mp.put(0,-1);//this is mkandatory because some test cases the codeis not working
        //take above example if some cases 1st element was not appear as a sum in that case we 1st put somw=0;
        //becaus 1st elem may or maynt come second time so
        for (int i = 0; i <arr.length ; i++) {
            prefixsum+=arr[i];
            if(mp.containsKey(prefixsum)){
                maxlength=Math.max(maxlength,i-mp.get(prefixsum));
            }
            else{
                mp.put(prefixsum,i);
            }
        }
        return  maxlength;
    }

    public static void main(String[] args) {
        int[] arr={15,7,-22,7,8,3,4};
        System.out.println(zerosumsubarry(arr));
    }
}
