package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class nqueenleetcode {

    private static void nquee(char[][] board, int row, List<List<String>> ans) {
        int n=board.length;
        if(row==n){
            List<String> s1=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String f="";
                for (int j = 0; j < n; j++) {
                f+= board[i][j];
                }
               s1.add(f);
            }
            ans.add(s1);
            return;
        }
        for (int i = 0; i < n; i++) {
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                nquee(board,row+1,ans);
                board[row][i]='.';//x;
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
       /*
             north
          west<--->east
                 south
        */
        int n=board.length;
        //checking is in that row there exit a queen or not
        for (int j = 0; j < n; j++) {
            if(board[row][j]=='Q') return false;

        }
        //checking is in that colum there exit a queen or not
        for (int j = 0; j < n; j++) {
            if(board[j][col]=='Q') return false;
        }
        //northeast
        int i=row,j=col;
        while(i>=0&&j<n) {
            if (board[i][j] == 'Q') return false;
            i--;
            j++;
        }

        i=row;j=col;
        //north west
        while(i>=0&&j>=0){
            if(board[i][j]=='Q') return  false;
            i--;j--;
        }
        i=row;j=col;
        //south east
        while(i<n&&j<n){
            if(board[i][j]=='Q') return  false;
            i++;j++;
        }
        i=row;j=col;
        //south west
        while(i<n&&j>=0){
            if(board[i][j]=='Q') return  false;
            i++;j--;
        }


        return true;
    }

public static int  totalNqueen(int n){
    char [][] board=new char[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            board[i][j]='.';
        }
    }
    List<List<String>> ans=new ArrayList<>();
    nquee(board,0,ans);
    return ans.size();
}
    public static void main(String[] args) {
        int n=4;
        char [][] board=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='.';
            }
        }
      List<List<String>> ans=new ArrayList<>();
        nquee(board,0,ans);
        System.out.println(ans);
        System.out.println(totalNqueen(4));
    }
}
