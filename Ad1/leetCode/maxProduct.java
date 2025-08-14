package leetCode;

public class maxProduct {


    public static  void maxProduct(int []nums){
        int product=1,max_prod=0;int stIdx=0,st = 0,endIndx=0;

        for(int i=0;i<nums.length;i++){

            if (product==0){
                st=i;
            }
            product*=nums[i];
            if(product>0){
                if(product>max_prod){
                    max_prod=Math.max(max_prod,product);
                    endIndx=i;
                    stIdx=st;
                }

            }
            if(product==0){
                product=1;
            }
        }
        System.out.println("max Product is"+max_prod);

    }

    public static void main(String[] args) {
        int arr[]={-2,-1,-3};
        maxProduct(arr);

    }
}
