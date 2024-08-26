package Arrays;

import java.util.Scanner;

public class SpiralMatrixTraversal {
    static void printMatrix(int[][] Matrix){
        for(int i=0; i<Matrix.length; i++){
            for(int j=0; j<Matrix[i].length; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] printSpiralOrder(int n){
        int[][] matrix = new int[n][n];
        int topRow = 0; int ButtonRow = n-1; int leftCol = 0; int rightCol = n-1;
        int curr = 1;
        while (curr<=n*n) {
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && curr<=n*n; j++) {
                matrix[topRow][j] = curr++;
            }
            topRow++;
            // rightCol -> topRow to buttonRow
            for (int i = topRow; i <= ButtonRow && curr<=n*n; i++) {
                matrix[i][rightCol] = curr++;
            }
            rightCol--;
            // buttonRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && curr<=n*n; j--) {
                matrix[ButtonRow][j] = curr++;
            }
            ButtonRow--;
            // leftCol -> buttonRow to topRow
            for (int i = ButtonRow; i >= topRow && curr<=n*n; i--) {
                matrix[i][leftCol] = curr++;
            }
            leftCol++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Traversal Matrix is: ");
        int[][] matrix = printSpiralOrder(n);
        printMatrix(matrix);
        sc.close();
    }
}

/*
OUTPUT:-
Enter the number: 3
Traversal Matrix is:
1 2 3
8 9 4
7 6 5
*/