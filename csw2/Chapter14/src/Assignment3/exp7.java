  package Assignment3;

public class exp7 {
    public static void main(String[] args) { 
        int[][] matrixA = { 
            {1, 2}, 
            {3, 4} 
        }; 
        int[][] matrixB = { 
            {5, 6}, 
            {7, 8} 
        }; 
        System.out.println("Matrix A:"); 
        for (int i = 0; i < matrixA.length; i++) { 
            for (int j = 0; j < matrixA[0].length; j++) { 
                System.out.print(matrixA[i][j] + " "); 
            } 
            System.out.println(); 
        } 
        System.out.println("Matrix B:"); 
        for (int i = 0; i < matrixB.length; i++) { 
            for (int j = 0; j < matrixB[0].length; j++) { 
                System.out.print(matrixB[i][j] + " "); 
            } 
            System.out.println(); 
        } 
        System.out.println("Matrix Addition:"); 
        int[][] additionResult = new int[matrixA.length][matrixA[0].length]; 
        for (int i = 0; i < matrixA.length; i++) { 
            for (int j = 0; j < matrixA[0].length; j++) { 
                additionResult[i][j] = matrixA[i][j] + matrixB[i][j]; 
                System.out.print(additionResult[i][j] + " "); 
            } 
            System.out.println(); 
        } 
        System.out.println("Matrix Multiplication:"); 
        int[][] multiplicationResult = new 
int[matrixA.length][matrixB[0].length]; 
        for (int i = 0; i < matrixA.length; i++) { 
            for (int j = 0; j < matrixB[0].length; j++) { 
                for (int k = 0; k < matrixA[0].length; k++) { 
                    multiplicationResult[i][j] += matrixA[i][k] * matrixB[k][j]; 
                } 
                System.out.print(multiplicationResult[i][j] + " "); 
            } 
            System.out.println(); 
        } 
        System.out.println("Transpose of Matrix A:"); 
        int[][] transposeA = new int[matrixA[0].length][matrixA.length]; 
        for (int i = 0; i < matrixA.length; i++) { 
            for (int j = 0; j < matrixA[0].length; j++) { 
                transposeA[j][i] = matrixA[i][j]; 
            } 
        } 
        for (int i = 0; i < transposeA.length; i++) { 
            for (int j = 0; j < transposeA[0].length; j++) { 
                System.out.print(transposeA[i][j] + " "); 
            } 
            System.out.println(); 

 
        } 
        try { 
            System.out.println("Accessing an out-of-bounds element to demonstrate exception handling:"); 
            System.out.println(matrixA[2][2]); 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Error: Attempted to access elements beyond matrix bounds. "); 
        } 
    
}
}
