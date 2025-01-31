package DPProg;

import java.util.Arrays;

public class FrogJump {
    public static  int mInEnergyNeed(int n,int arr[]){
        if(n==0)return 0;
        int step1jum=mInEnergyNeed(n-1,arr)+ Math.abs(arr[n]-arr[n-1]);
        int step2jum=0;
        if(n>1) {
            step2jum = mInEnergyNeed(n - 2, arr) + Math.abs(arr[n] - arr[n - 2]);
        }
        else{
            step2jum= Integer.MAX_VALUE;
        }
        return Math.min(step1jum,step2jum);

    }
    //using memoization

    public static  int mInEnergyNeedMemoIZATion(int n,int arr[],int dp[]){
        if(n==0)return 0;
        if(dp[n]!=-1) return dp[n];
        int step1jum=mInEnergyNeed(n-1,arr)+ Math.abs(arr[n]-arr[n-1]);
        int step2jum=0;

        if(n>1) {
            step2jum = mInEnergyNeed(n - 2, arr) + Math.abs(arr[n] - arr[n - 2]);
        }
        else{
            step2jum= Integer.MAX_VALUE;
        }
        return dp[n]=Math.min(step1jum,step2jum);

    }
    public static  int mInEnergyNeedTabulation(int arr[]){
        int dp[]=new int[arr.length];
        dp[0]=0; int Step1jump=dp[0];
        for (int i = 1; i < dp.length; i++) {
            int curr1jump = dp[i-1]+Math.abs( arr[i] - arr[i - 1]);
          int curr2jump=0;
          if(i>1){
               curr2jump= dp[i-2]+Math.abs(arr[i]-arr[i-2]);
          }
          else curr2jump=Integer.MAX_VALUE;
          dp[i]=Math.min(curr1jump,curr2jump);

        }
        for(int i:dp) System.out.print(i+" ");
        System.out.println();
       return dp[arr.length-1];
    }
    public static void main(String[] args) {
      //  int arr[]={30,10,60,10,60,50};
        int arr[]={10,20,30,10};

        int dp[]=new int[arr.length+1];
        Arrays.fill(dp,-1);
        System.out.println("total energy needed is:->"+mInEnergyNeed(arr.length-1,arr));
        System.out.println("total energy needed(Memoization) is:->"+mInEnergyNeedMemoIZATion(arr.length-1,arr,dp));
        System.out.println("total energy needed(Tabulation) is:->"+mInEnergyNeedTabulation(arr));


    }
}
