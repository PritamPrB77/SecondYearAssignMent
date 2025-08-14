package Backtracking;

public class ratinmaze3 {
    /*
    in this roblem theree is  someblock we have
     */

    private static void  printmazepath(int entrrow , int entrcol, int targetrows, int targetcol,String s,boolean vis[][],int maze[][]) {
//        if(vis[entrrow][entrcol]) return;  --> it gives array index bound exception due to   if(entrrow<0||entrcol<0)  consition
        if(entrrow<0||entrcol<0) return;
        if(entrrow>targetrows||entrcol>targetcol) return;
        if(vis[entrrow][entrcol]) return;
        if(entrrow==targetrows && entrcol==targetcol) {
            System.out.println(s);
            return;
        }
        if(maze[entrrow][entrcol]==0) return;
        vis[entrrow][entrcol]=true;
        //go right
        printmazepath(entrrow,entrcol+1,targetrows,targetcol,s+"R",vis,maze);
        //go  down
        printmazepath(entrrow+1,entrcol,targetrows,targetcol,s+"D",vis,maze);
        // go up
        printmazepath(entrrow-1,entrcol,targetrows,targetcol,s+"u",vis,maze);
        //go left
        printmazepath(entrrow,entrcol-1,targetrows,targetcol,s+"L",vis,maze);
        vis[entrrow][entrcol]=false;


    }




    private static void  printmazepath2(int entrrow , int entrcol, int targetrows, int targetcol,String s,int maze[][]) {
//        if(vis[entrrow][entrcol]) return;  --> it gives array index bound exception due to   if(entrrow<0||entrcol<0)  consition
        if(entrrow<0||entrcol<0) return;
        if(entrrow>targetrows||entrcol>targetcol) return;
        if(maze[entrrow][entrcol]==-1) return;
        if(entrrow==targetrows && entrcol==targetcol) {
            System.out.println(s);
            return;
        }
        if(maze[entrrow][entrcol]==0) return;
        maze[entrrow][entrcol]=-1;
        //go right
        printmazepath2(entrrow,entrcol+1,targetrows,targetcol,s+"R",maze);
        //go  down
        printmazepath2(entrrow+1,entrcol,targetrows,targetcol,s+"D",maze);
        // go up
        printmazepath2(entrrow-1,entrcol,targetrows,targetcol,s+"u",maze);
        //go left
        printmazepath2(entrrow,entrcol-1,targetrows,targetcol,s+"L",maze);
        maze[entrrow][entrcol]=1;


    }




    public static void main(String[] args) {
        int rows=3;
        int col=4;
        boolean isVisited[][]=new boolean[rows][col];

      int [][]maze={{1,0,1,1},
                     {1,1,1,1},
                     {1,1,0,1}};

        printmazepath(0,0,rows-1,col-1,"",isVisited,maze);
        System.out.println();
        System.out.println();
        printmazepath2(0,0,rows-1,col-1,"",maze);
    }
}
