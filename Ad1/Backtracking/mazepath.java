package Backtracking;

public class mazepath {
    /*
    a 2d mazepath
    rat have to reach its destination by going either down or right no other direction allows
    count Number of paths
     */

    public static void main(String[] args) {
        int rows=3;
        int col=3;
        System.out.println(" Total Number of maze path Are :-"+countmazepath(1,1,rows,col));

        printmazepath(1,1,rows,col,"");
    }

    private static int countmazepath(int entrrow , int entrcol, int targetrows, int targetcol) {
        if(entrrow>targetrows||entrcol>targetcol) return  0;
        if(entrrow==targetrows && entrcol==targetcol) return 1;
        int rightways=countmazepath(entrrow,entrcol+1,targetrows,targetcol);
        int downways=countmazepath(entrrow+1,entrcol,targetrows,targetcol);
        return  rightways+downways;



    }

    private static void  printmazepath(int entrrow , int entrcol, int targetrows, int targetcol,String s) {
        if(entrrow>targetrows||entrcol>targetcol) return;
        if(entrrow==targetrows && entrcol==targetcol) {
            System.out.println(s);
            return;
        }
        printmazepath(entrrow,entrcol+1,targetrows,targetcol,s+"R");
        printmazepath(entrrow+1,entrcol,targetrows,targetcol,s+"D");




    }




}
