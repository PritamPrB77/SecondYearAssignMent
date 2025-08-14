package leetCode;

import java.util.HashMap;

public class movezerotoend {




    public static int add(int nums[],int x,int i){
        for (int j = 0; j < nums.length; j++) {
            nums[i]=x;
            i+=1;
        }

     return i;
    }

        public static  void moveZeroes(int[] nums) {
            //HashMap<Integer,Integer> mp=new HashMap<>();
            int [] arr= nums.clone(); int l=0;int r=nums.length-1;
            for(int i=0;i<nums.length;i++){
//                if(mp.containsKey(nums[i])){
//                    if(nums[i]!=0){
//                        arr[l++]=nums[i];
//                    }
//                    else if(nums[i]==0){
//                        arr[r--]=0;
//                    }
//                    int a=mp.get(nums[i]);
//                    mp.put(nums[i],a+1);
//                }
//                else{
//                    if(nums[i]!=0){
//                        arr[l++]=nums[i];
//                    }
//                    else if(nums[i]==0){
//                        arr[r--]=0;
//                    }
//                    arr[l++]=nums[i];
//                    mp.put(nums[i],1);
//                }


                if(nums[i]==0){
                       arr[r--]=0;
                  }
                else{
                    arr[l++]=nums[i];
                }
            }

nums=arr.clone();
            for(int i:nums){
                System.out.println(i);
            }
        }





        public static void main(String[] args) {

            int nums[]={0,1,0,3,12};
            moveZeroes(nums);
        }
    }



