package Backtracking;


import java.util.ArrayList;
import java.util.List;

public class printpermutation {
    //bruteforce approach

    public  static  void printp(String s, String ans){

        if(s.equals("")){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            String left= s.substring(0,i);
            String right=s.substring(i+1);
            String rem=left+right;
            printp(rem,ans+ch);
        }

    }
//optimized approach

    public  static  void printstringpath(int idx, String s){
               int n=s.length();
               if(idx==n-1){
                   System.out.println(s);
                   return;
               }
        for (int i = idx; i < s.length(); i++) {
            s= swap( idx, i, s);
            printstringpath(idx+1,s);
            s= swap( idx, i, s);
        }

    }

 public  static  String swap(int i,int j,String s){
       char [] arr=new char[s.length()];
       arr=s.toCharArray();
       char ch=arr[i];
       arr[i]=arr[j];
       arr[j]=ch;
     String st="";
     for( char ch1:arr){
         st+=ch1;
     }
      return  st;
  }
     public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans= new ArrayList<>();
        helper(nums,0,ans);
        return ans;

     }

    private  static void helper(int []nums, int idx, List<List<Integer>> ans) {
        int n=nums.length;
        if(idx==n-1){
            List<Integer> s1=new ArrayList<>();
            for(int i:nums){
                s1.add(i);
            }
           ans.add(s1);
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap2(i,idx,nums);
            helper(nums,idx+1,ans);
            swap2(i,idx,nums);
        }


    }

    private static void swap2(int i, int idx, int[] nums) {

        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }



    public static List<List<Integer>> permute2(int[] nums){
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        boolean [] isvalid=new boolean[nums.length];
        helper2(nums,0,ans,ds,isvalid);
        return ans;

    }

    private static void helper2(int[] nums, int i, List<List<Integer>> ans, List<Integer> ds, boolean[] isvalid) {
        int n=nums.length;
        if(ds.size()==n){
            List<Integer> list=new ArrayList<>();
            for (int j = 0; j < ds.size(); j++) {
                list.add(ds.get(j));
            }
            ans.add(list);
            return;
        }

        for (int j = 0; j < nums.length; j++) {
            if(isvalid[j]==false){
                ds.add(nums[j]);
                isvalid[j]=true;
                helper2(nums,i+1,ans,ds,isvalid);
                isvalid[j]=false;
                ds.remove(ds.size()-1);
            }

        }
    }


    public static void main(String[] args) {
        String str="abc";
        printp(str,"");

        System.out.println();

        printstringpath(0,str);


        int nums[]={1,2,3};
        List<List<Integer>> ans=permute2(nums);

        System.out.println(ans);
    }


}
