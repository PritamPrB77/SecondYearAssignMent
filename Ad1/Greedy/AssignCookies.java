package Greedy;

import java.util.Arrays;

public class AssignCookies{
    public static int AssignCookies(int greed[],int cookie[]){//123 11
             int l=greed.length;
             int m=cookie.length;
        Arrays.sort(greed);
        Arrays.sort(cookie);
             int i=0,j=0;
             while(i<m &&j<l){
                 if(cookie[i]>=greed[j]){
                    j++;
                 }
                 i++;
             }

        return j;
    }
    public static void main(String[] args) {
       // greed[] = [1, 2, 3], cookie = [1, 1]
        int greed[]={1,2}; int[]cookie={1,2,3};
        System.out.println(AssignCookies(greed,cookie));

    }
}
