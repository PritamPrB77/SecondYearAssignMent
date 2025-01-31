package Greedy1;

import java.util.Arrays;
import java.util.Comparator;

//fractional knapSack problem
public class greedy2 {
    public static void main(String[] args) {
        int []val={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        double ratio[][]=new double [val.length][2];
       // System.out.println(ratio.length);
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];

        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        for(double i[]:ratio){
            for(double j:i){
                System.out.print(" "
                +j+" ");
            }
            System.out.println();
        }
        int capactity=w; int finalValue=0;
        for(int i= ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capactity>weight[idx]){
                finalValue+=val[idx];
                capactity-=weight[idx];
            }
            else{
                finalValue+=(ratio[i][1]*capactity);
                capactity=0;
                break;
            }
        }
        System.out.println("final value:-"+finalValue);

    }
}
