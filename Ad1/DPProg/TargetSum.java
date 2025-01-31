package DPProg;

import java.util.Scanner;

public class TargetSum {
    public static void PrintTabulation(boolean arr[][]) {
        for (boolean i[]:arr){
            for(boolean j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static  boolean TargetSumSUBsetExitRNOt(int setArr[],int target){
        ///n=SetArr.length -->n+1 -->roes, Target+1 columns;
        boolean dp[][]=new boolean[setArr.length+1][target+1];
        for(int i=0;i<dp.length;i++) dp[i][0]=true;
        PrintTabulation(dp);//this is foe checkinng that in java all are false prebuiltly
        System.out.println("------>");
        if (setArr[0] <= target) {
            dp[0][setArr[0]] = true;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                int value=setArr[i-1];
                //steps-->
                //if the subset of number is less than j means its valid if valid then i check for if dp[j-value] is true then addition
                //of this value is also true meand if i=2 and j=6;
                //if 4 is there then 6-2  if dp[1][4] is true then its also true

                if(value<=j&& dp[i-1][j-value]==true){///valid case
                    dp[i][j]=true;
                }
                //if not then we exclude it we check that if dp[i-1][j] will true then it will true
                //ex-->7321 i is include or exlude it has no meaning alwya it return true
               else if(dp[i-1][j]==true){ //exclude case
                   dp[i][j]=true;
                }
            }
        }

        PrintTabulation(dp);
        return  dp[setArr.length-1][target];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int arr[]={sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
        System.out.println(" enter the target");
        int target=sc.nextInt();
        System.out.println("total Sum Possible Or not :"+TargetSumSUBsetExitRNOt(arr,target));
    }
}
