package leetCode;

public class removeDuplicate {
    public  static void removeDuplicates(int[] nums) {
        int count=0;
        int i=0;
      while(i< nums.length-1){
            count=0;int j=i;int m=0;
          while(nums[j]==nums[j+1]){
              count++;

              j++;
          }

            if(count>2){
                System.out.println(count);
                int k=j;m=j;
               count=count-2;
               while(count>0){
                   System.out.println();
                   while(j<nums.length-1){
                       int temp=nums[j];
                       nums[j]=nums[j+1];
                       nums[j+1]=temp;
                       j++;
                   }
                   j=k;
                   k=k-1;
                   j=j-1;
                   System.out.println("hello");
                   count--;
               }
            }
            i=j;
             i++;
        }
        for(int m:nums) System.out.print(m+" ");

    }
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,1,2,3,3};
    removeDuplicates(nums);

    }
}
