package Greedy1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//indian coins problem
public class greedy5 {

    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,200,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int coinAmt=0;
        System.out.println("enter Amt:->");
        Scanner sc=new Scanner(System.in);
        int Amt=sc.nextInt();
        int CountOfCOINS=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=Amt){
                while(coins[i]<=Amt){
                    CountOfCOINS++;
                    ans.add(coins[i]);
                    Amt-=coins[i];
                }
            }
        }
        System.out.println("Total coin count->"+CountOfCOINS);

        System.out.print("coins are");
        for (int i = 0; i < ans.size() ; i++) {
            System.out.print(" "+ans.get(i)+" ");
        }
        System.out.println();
    }

}
