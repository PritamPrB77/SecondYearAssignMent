package Greedy1;
//max length Chain Pairs means A pair of (c,d) come after(a,b) if b<c;

import java.util.Arrays;
import java.util.Comparator;

public class greedy4 {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int chainpossible=1;
        int chainEnd=pairs[0][1];
        for (int i = 0; i < pairs.length; i++) {
            if(pairs[i][0]>chainEnd){
                chainpossible++;
                chainEnd=pairs[i][1];
            }
        }
        System.out.println("number of possible chains is"+chainpossible);

    }
}
