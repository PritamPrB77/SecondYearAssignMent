package Backtracking;

public class mazepath4d {
    public static void main(String[] args) {
        int rows=3;
        int col=3;
        boolean isVisited[][]=new boolean[rows][col];
        System.out.println(" Total Number of maze path Are :-"+countmazepath(0,0,rows-1,col-1, isVisited));

        printmazepath(0,0,rows-1,col-1,"",isVisited);
    }

    private static int countmazepath(int entrrow , int entrcol, int targetrows, int targetcol,boolean vis[][]) {

        if(entrrow<0||entrcol<0) return 0;
        if(entrrow>targetrows||entrcol>targetcol) return 0;
        if(vis[entrrow][entrcol]) return 0;
        if(entrrow==targetrows && entrcol==targetcol) {

            return 1;
        }
        vis[entrrow][entrcol]=true;
        //go right
       int a=  countmazepath(entrrow,entrcol+1,targetrows,targetcol,vis);
        //go  down
       int b= countmazepath(entrrow+1,entrcol,targetrows,targetcol,vis);
        // go up
       int c= countmazepath(entrrow-1,entrcol,targetrows,targetcol,vis);
        //go left
      int d=  countmazepath(entrrow,entrcol-1,targetrows,targetcol,vis);

        vis[entrrow][entrcol]=false;
        return a+b+c+d;

    }


    private static void  printmazepath(int entrrow , int entrcol, int targetrows, int targetcol,String s,boolean vis[][]) {
//        if(vis[entrrow][entrcol]) return;  --> it gives array index bound exception due to   if(entrrow<0||entrcol<0)  consition
        if(entrrow<0||entrcol<0) return;
        if(entrrow>targetrows||entrcol>targetcol) return;
        if(vis[entrrow][entrcol]) return;
        if(entrrow==targetrows && entrcol==targetcol) {
            System.out.println(s);
            return;
        }
        vis[entrrow][entrcol]=true;
        //go right
        printmazepath(entrrow,entrcol+1,targetrows,targetcol,s+"R",vis);
        //go  down
        printmazepath(entrrow+1,entrcol,targetrows,targetcol,s+"D",vis);
        // go up
        printmazepath(entrrow-1,entrcol,targetrows,targetcol,s+"u",vis);
        //go left
        printmazepath(entrrow,entrcol-1,targetrows,targetcol,s+"L",vis);
        vis[entrrow][entrcol]=false;


    }


}
