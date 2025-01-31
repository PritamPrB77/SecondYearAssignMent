package DPProg;

import java.util.Scanner;

public class UnBoundedKnapSack {
    //it is the KnapScak where Repetation Are Allowed
    public static void PrintTabulation(int arr[][]) {
        for (int i[]:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

    }
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


        System.out.println("Total Weight Using UBKNPSK (Tabulation) is: "+UnBOUnDEdKnApSAcKTabuLation(val,wt,cap));
    }
}
