package Practse;

public class kadeneAlgo {
    //printing largest SubArray
    public static void largestSumConigiosSubArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    //find max in subArry using below thre MEthod
    public static int largestSumConigiosSubArrray(int arr[]){//brute force
        int op=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum>op) op=sum;

            }
        }
        return op;
    }
    public static int largestSumConigiosSubArrray2(int arr[]){//good but not optimized
        int op=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
                int sum=0;
            for(int j=i;j<arr.length;j++){
                 sum+=arr[j];
                 if(sum>op) op=sum;
            }
        }
        System.out.println("done 2");
        return op;
    }
    ///optimized And Kadenes Algorithim
    public static int largestSumConigiosSubArrray3(int arr[]){
        int op=Integer.MIN_VALUE;
        int sum=0; int start=0,startAns=0,endAns=0;
        for(int i=0;i<arr.length;i++){
            if(sum==0) start=i;
            //it refresh The Array NAd Start from New Positionif -ve is found
            sum+=arr[i];
            if(sum>op){
                System.out.println(sum);
                op=sum;
                startAns=start;
                endAns=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("the SUb ArrAY is");
        for(int i=startAns;i<=endAns;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("done 3");
        return op;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,-5,-7,2,5};
        //largestSumConigiosSubArray(arr);
        System.out.println("op is"+ largestSumConigiosSubArrray3(arr));
    }

}
