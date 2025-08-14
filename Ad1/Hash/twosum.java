package Hash;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {
    //bruteForcce Approach t.c 0(n^2)

    public static int[] bftwosum(int arr[],int target){
        //i have to return the pair of elements whose sum equals target if not i return -1;
        int[]ans={-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]==target-arr[i]){
                  return  ans=new int[]{i,j};

                }
            }
        }
        return ans;
    }
    //2nd optimized approach
    //t.c o(nlogn)
    public  static  int binarysearch(int arr[],int l,int r,int x){
        if(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(x>mid){
                return  binarysearch(arr,mid+1,r,x);
            }
            else {
                return  binarysearch(arr,l,mid-1,x);
            }
        }
        return -1;
    }
    public static int[] bstwosum(int arr[],int target){
        //i have to return the pair of elements whose sum equals target if not i return -1;
        int[]ans={-1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int x=binarysearch(arr,0,arr.length-1,target-arr[i]);
           if(x!=-1){
                ans=new int[]{i,x};
           }
        }
        return ans;
    }


///hashmap approach
    public static  int[]  hashtwosum(int []arr,int target){
        int ans[]={-1};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int partner=target-arr[i];
            if (mp.containsKey(partner)) {
              return   ans=new int[]{i,mp.get(partner)};
            }
            else{
                mp.put(arr[i],i);
            }
        }
        return ans;
    }




    public static void main(String[] args) {
        //a.toCharArray--<converts and String array to character array
//        int []nums=new int[]{3,4,5,6};
//        nums=new int[]{3,4,5,6,7};
//        System.out.println(nums.length);
        int arr[]={1,2,3,4,6,7};

        for(var i:bftwosum(arr,5)){
            System.out.print(i+" ");
        }
        System.out.println();
        for(var i:bstwosum(arr,5)){
            System.out.print(i+" ");
        }
        System.out.println();
        for(var i:hashtwosum(arr,5)){
            System.out.print(i+" ");
        }

    }

}
