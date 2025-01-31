package Greedy1;
//min- absolute Difference Pair

import java.util.Arrays;

public class greedy3 {
    public static void main(String[] args) {
        int p=-90;
        System.out.println(Math.abs(p));
        int a[]={1,2,3};
        int b[]={2,1,4};
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i:a) System.out.print(i+"");
        System.out.println();
        for(int i:b) System.out.print(i+"");
        System.out.println();
        int minDiff=0;

        for (int i = 0; i < a.length ;i++) {
            minDiff+=Math.abs(a[i]-b[i]);
        }
        System.out.println("min dif:-->"+minDiff);
    }
}
