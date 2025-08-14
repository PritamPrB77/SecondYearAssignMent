package AssignMent_19;


class MatrixMultiplierThread extends Thread { 
    private final int[][] A, B, result; 
    private final int row; 
    public MatrixMultiplierThread(int[][] A, int[][] B, int[][] result, int row) 
{ 
        this.A = A; this.B = B; this.result = result; this.row = row; 
    } 
    @Override
    public void run() { 
        int colsB = B[0].length; int colsA = A[0].length; 
        for (int j = 0; j < colsB; j++) { 
            result[row][j] = 0; 
            for (int k = 0; k < colsA; k++) { 
                result[row][j] += A[row][k] * B[k][j]; 
            } 
        } 
    } 
} 
public class MatrixMultiplication { 
    public static void main(String[] args) { 
        int[][] A = { 
            {1, 2, 3}, 
            {4, 5, 6} 
        }; 
        int[][] B = { 
            {7, 8}, 
            {9, 10}, 
            {11, 12} 
        }; 
        int rowsA = A.length; 
        int colsB = B[0].length; 
        int[][] result = new int[rowsA][colsB]; 
        MatrixMultiplierThread[] threads = new MatrixMultiplierThread[rowsA]; 
        for (int i = 0; i < rowsA; i++) { 
            threads[i] = new MatrixMultiplierThread(A, B, result, i); 
            threads[i].start(); 
        } 
        for (int i = 0; i < rowsA; i++) { 
            try { 
                threads[i].join(); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
        System.out.println("Resultant Matrix:"); 
        for (int[] row : result) { 
            for (int value : row) { 
                System.out.print(value + " "); 
            } 
            System.out.println(); 
        } 
    }
}
    