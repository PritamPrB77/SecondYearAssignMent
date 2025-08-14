import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static  void merge(int[][] intervals) {
        int row=intervals.length;
        int col=intervals[0].length;
        List<List<Integer>> al=new ArrayList<>();
//         for(int i=0;i<row;i++){
//             al.add(new ArrayList<>());
//         }
        System.out.println(al.size());
        Arrays.sort(intervals, (i, j) -> i[0] - j[0]);
        for(int i=0;i<row;i++){
            int bInd=al.size();

            if(al.isEmpty()||intervals[i][0]>al.get(bInd-1).get(1)){
               List<Integer> demo=new ArrayList<>();
               demo.add(intervals[i][0]);
               demo.add(intervals[i][1]);
               al.add(demo);
            }
            else{
                int Maxelem=Math.max(intervals[i][1],al.get(bInd-1).get(1));
                al.get(bInd-1).set(1,Maxelem);
            }
        }
        int res[][]=new int[al.size()][2];
        for(int i=0;i<al.size();i++){
            res[i][0]=al.get(i).get(0);
            res[i][1]=al.get(i).get(1);
            System.out.println(res[i][0]+"  "+res[i][1]);
        }
//        return 1;

    }

    public static void main(String[] args) {
        int intervals[][]={{1,2},{1, 3},{5,6}};
        merge(intervals);
    }
}