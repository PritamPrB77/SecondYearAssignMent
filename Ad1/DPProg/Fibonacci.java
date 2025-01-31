package DPProg;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    //using recussion its TimeComplexity is 2^n sc->o(n);
    public  static int recursefibo(int n){
        if(n<=1) return n;
        else return  recursefibo(n-1)+recursefibo(n-2);

    }
    //using dp we reduce its tc - tc->0(n) sc-->o(n)+o(n);
    public  static int recursefiboDP(int n,int dp[]){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
         return  dp[n]= recursefiboDP(n-1,dp)+recursefiboDP(n-2,dp);

    }
    //using dp we reduce its tc - tc->0(n) sc-->+o(n);

    public  static int iteratefiboDP(int n,int dp[]){
             dp[0]=0;
             dp[1]=1;
             for(int i=2;i<=dp.length-1;i++){
                 dp[i]=dp[i-1]+dp[i-2];
             }
             return dp[dp.length-1];
    }
    //using dp we reduce its tc - tc->0(n) sc-->+o(1);
    public  static int iteratefiboDP2(int n){
       int prev=1, prevprev=0;
       if(n==0||n==1) return n;
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

        System.out.println("values are:-"+recursefibo(n)+" "+recursefiboDP(n,arr)+" "+iteratefiboDP(n,arr)+" "+
                iteratefiboDP2(n));

    }
}