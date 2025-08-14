package Hash;

import java.util.HashSet;

public class maxNumberOnTable {
    // U R given n distinct pairs, each pair numbered from i to n
    /*
    ex-.inp>1
    11
    op->1

    ex2->
    inp->3
    2,1,1,3,2,3
    op>2
     */
    public  static  int maxNumberonTable(int[]bag){
        HashSet<Integer> table=new HashSet<>();
          int max=0;

        for (int i = 0; i < bag.length; i++) {
            int num=bag[i];
            if(table.contains(num)){
                table.remove(num);
            }
            else{
                table.add(num);
                max=Math.max(max,table.size());
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []nums={2,1,1,3,2,3};
        System.out.println(maxNumberonTable(nums));

    }
}
