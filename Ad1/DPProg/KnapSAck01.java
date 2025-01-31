package DPProg;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class KnapSAck01 {
    public static void PrintTabulation(int arr[][]) {
        for (int i[]:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static  int KnapsAck01(int val[],int wt[],int cap,int idx){
        if(idx==0||cap==0) return 0;
        if(wt[idx-1]<=cap){//valid Case
            //Case-1 Included
            int include= val[idx-1]+KnapsAck01(val,wt,cap-wt[idx-1],idx-1 );
            //CAse-2 NotIncluded
            int notinclude=KnapsAck01(val,wt,cap,idx-1);
            return  Math.max(include,notinclude);
        }
        else{
          return KnapsAck01(val,wt,cap,idx-1);
        }
    }
    public static  int KnapsAck01MemoIzation(int val[],int wt[],int dp[][],int cap,int idx){
        //capacity=cap
        if(idx==0||cap==0) return 0;
        if(dp[idx][cap]!=-1){
            return dp[idx][cap];
        }
        if(wt[idx-1]<=cap){
            int include= val[idx-1]+KnapsAck01MemoIzation(val,wt,dp,cap-wt[idx-1],idx-1 );
            int notinclude=KnapsAck01MemoIzation(val,wt,dp,cap,idx-1);
            return  dp[idx][cap]=Math.max(include,notinclude);
        }
        else{
            return  dp[idx][cap]=KnapsAck01MemoIzation(val,wt,dp,cap,idx-1);
        }
    }

    public  static  int KnapSAckTAbuLaTion(int val[],int wt[],int cap){
       int n=val.length;
       int [][] dp=new int[n+1][cap+1];
       for(int i=0;i<dp.length;i++){
           dp[i][0]=0;
       }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<dp.length;i++){/// items available
            //we also write n+1 instead of dp.length
            for(int j=1;j<dp[i].length;j++){   //j is the weight available for that items
                // //we also write cap+1 instead of dp[i].length
                int v=val[i-1];//v->value of the ith item
                int w =wt[i-1];    //w->weight value of the ith weight
                if(w<=j){//valid case
                    //case-1> includde
                    int include=v+dp[i-1][j-w];
                    //case2->notInclude
                    int notinclude=dp[i-1][j];
                    dp[i][j]=Math.max(include,notinclude);
                }
                else { //not valid
                    //exclude case
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
          PrintTabulation(dp);
       return  dp[n][cap];
    }

    //Adding UnBoundedKnapScak Fpr Testing
    public static  int UnBOUnDEdKnApSAcKTabuLation(int val[],int wt[],int cap){
        //cap-->total capacity
        int n=val.length;
        int dp[][]=new int[n+1][cap+1];
        for(int i=0;i<dp.length;i++) dp[i][0]=0;//filling oth column zero as base cond^n
        for(int i=0;i<dp[0].length;i++) dp[0][i]=0;//filling 0th row zero as base case
        for(int i=1;i<n+1;i++){
            for(int j=1;j<cap+1;j++){
                //1st we out the value i.e->v=val[i-1];
                //2nd we out the weight i.e->W=wt[i-1];
                if(wt[i-1]<=j){ //Valid Case i.e(case 1->Inclded,case2->NotIncluded)
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                    //Math.max(included-->v+dp(i,j-w) i is due to repeated case is also allowed && NotIncluded(i-1,j)
                }
                else  dp[i][j]=dp[i-1][j];  //if not valid then
            }
        }
        PrintTabulation(dp);
        return dp[val.length][cap];
    }
    public static void main(String[] args) {
//        int val[]={15,14,10,45,30};
//        int wt[]={2,5,1,3,4};
//        int cap=7;
        System.out.println("enter values");
        Scanner sc=new Scanner(System.in);
        int val[]={sc.nextInt(),sc.nextInt(),sc.nextInt()};
        System.out.println("enter weights");
        int wt[]={sc.nextInt(),sc.nextInt(),sc.nextInt()};
        System.out.println("enter capacity");
        int cap=sc.nextInt();

        int dparr[][]=new int[val.length+1][cap+1];
        //Arrays.fill(arr,-1); its not working

          for (int i=0;i<dparr.length;i++){
              for(int j=0;j<dparr[i].length;j++){
                  dparr[i][j]=-1;
              }
          }


        System.out.println("total capacity is( using recursion):"+KnapsAck01(val,wt,cap,val.length));
        System.out.println("total capacity is( using memoization):"+ KnapsAck01MemoIzation(val,wt,dparr,cap,val.length));
        System.out.println("total capacity is( using Tabulation):"+KnapSAckTAbuLaTion(val,wt,cap));
        System.out.println("Total Weight Using UBKNPSK (Tabulation) is: "+UnBOUnDEdKnApSAcKTabuLation(val,wt,cap));



    }
}
