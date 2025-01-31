package DPProg;

import java.util.Arrays;
import java.util.Scanner;

public class StaireJUmp {

        public  static int recurseWaysJump(int n){
            if(n==0) return 1;
            if(n<0) return 0;

            return  recurseWaysJump(n-1)+recurseWaysJump(n-2);

        }
        //using dp we reduce its tc - tc->0(n) sc-->o(n)+o(n);
        public  static int recurseWaysJumpDP(int n,int dp[]){
            if(n==0) return 1;
            if(n<0) return 0;
            if(dp[n]!=-1) return dp[n];
            return  dp[n]=recurseWaysJumpDP(n-1,dp)+recurseWaysJumpDP(n-2,dp);

        }
        //using dp we reduce its tc - tc->0(n) sc-->+o(n);

        public  static int iterateWaysJumpDP(int n,int dp[]){
            dp[0]=1;

            for(int i=1;i<=dp.length-1;i++){
                if(i==1) dp[i]=dp[i-1];
                else dp[i]=dp[i-1]+dp[i-2];
            }
            return dp[dp.length-1];
        }
        //using dp we reduce its tc - tc->0(n) sc-->+o(1);
        public  static int iterateWaysJumpDP2(int n){
            int prev=1, prevprev=1;

            for(int i=2;i<=n;i++){
                int curr=prev+prevprev;
                prevprev=prev;
                prev=curr;
            }
            return prev;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter data");
            int  n=sc.nextInt();
            int arr[]=new int[n+1];
            Arrays.fill(arr,-1);

            System.out.println("values are:-"+recurseWaysJump(n)+" "+recurseWaysJumpDP(n,arr)+" "+iterateWaysJumpDP(n,arr)+" "+
                    iterateWaysJumpDP2(n));

        }

}
