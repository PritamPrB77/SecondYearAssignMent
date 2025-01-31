package Greedy1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//Activity Selection Questions
public class Greedy1 {
    public static void main(String[] args) {
       int start[]={5,1,3,0,5,8,5} ;
       int end[]={10,2,4,6,7,8,9};
       int activities[][]=new int[start.length][3];
       for(int i=0;i<activities.length;i++){
           activities[i][0]=i;
           activities[i][1]=start[i];
           activities[i][2]=end [i];

       }


       for(int []i:activities)
       {
           System.out.print("A"+activities[i[0]][0]);
           for(int j:i) System.out.print(" "+j + " ");

           System.out.println();
       }
        System.out.println("//////////////////////");

       Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        for(int []i:activities)
        {
            System.out.print("A"+activities[i[0]][0]);
            for(int j:i) System.out.print(" "+j + " ");

            System.out.println();
        }

        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=0;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("maximum activities="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
