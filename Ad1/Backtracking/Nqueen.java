package Backtracking;

public class Nqueen {


    private static void nquee(char[][] board, int row) {
        int n=board.length;
        if(row==n){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                nquee(board,row+1);
                board[row][i]='X';//x;
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


    public static void main(String[] args) {
     int n=4;
     char [][] board=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              board[i][j]='X';
            }
        }

        nquee(board,0);
    }


}
