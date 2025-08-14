package leetCode;

import java.util.HashMap;

public class singleNumber {

    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                int a=mp.get(nums[i]);
                mp.put(nums[i],a+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }
        System.out.println(mp);
        for (int i = 0; i <nums.length ; i++) {
           // System.out.println(mp.get(nums[i]));
            if(mp.get(nums[i])==1){

                return nums[i];
            }
        }
        return -1;
    }


//    public static  int buyandsell(int nums[]){
////        public int maxProfit(int[] prices) {
////            int maxp=0,price=0;
////            for(int i=0;i<prices.length;i++){
////                for(int j=i+1;j<prices.length;j++){
////                    price=prices[j]-prices[i];
////                    maxp= Math.max(price,maxp);
////                }
////            }
////            return maxp;
////        }
//
//
//
//        HashMap<Integer,Integer> mp=new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            if(mp.containsKey(nums[i])){
//                int a=mp.get(nums[i]);
//                mp.put(nums[i],a+1);
//            }
//            else{
//                mp.put(nums[i],i);
//            }
//        }
//
//    }








    public static void main(String[] args) {
        int nums[]={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
