package Practse;

import java.util.Arrays;

//smallest Positive Missing Number
public class p1 {


        public static int firstMissingPositive(int[] nums) {
            Arrays.sort(nums);
            int res=1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=0){
                    if(nums[i]==res){
                        res++;
                    }
                    else if(nums[i]>res){
                        break;
                    }
                }
            }
            return res;
        }
    public static int firstMissingPositiverecurse(int[] nums,int res,int i,boolean s) {
        if (s == true) {
            Arrays.sort(nums);
            s = false;
        }
        if (i == nums.length ) return res;

        if (nums[i] >= 0) {
            if (nums[i] == res) {
              return   firstMissingPositiverecurse(nums, ++res, ++i, s);
            }
            else if(nums[i]>i){
                return   firstMissingPositiverecurse(nums, res, ++i, s);
            }

        }
        else {
            return   firstMissingPositiverecurse(nums, res, ++i, s);
        }
         return  res;

    }

    public static void main(String[] args) {
        int nums[]={3,5,-1,2};

        System.out.println(firstMissingPositiverecurse(nums,1,0,true));
    }
}
