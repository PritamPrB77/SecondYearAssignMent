package Hash;

import java.util.HashSet;

public class longconsecativesum {
    /*
    for inp->n=6,
    nuums[] ={99,100,4,200,1,3,2}
    op->1,2,3,4 i.e 4

        */
    public static int longconssum(int nums[]){
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums)hs.add(num);
        int maxStrak=0;
        for(int num:hs){
            if(!hs.contains(num-1)){
                int currNum=num;
                int currstreak=1;
                while(hs.contains(currNum+1)){
                    currstreak++;
                    currNum++;
                }
                maxStrak=Math.max(currstreak,maxStrak);
            }
        }
        return  maxStrak;
    }

    public static void main(String[] args) {
        int  nuums[] ={99,100,4,200,1,3,2};
        System.out.println(longconssum(nuums));
    }
}
