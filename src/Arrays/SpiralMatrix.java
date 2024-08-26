package Arrays;

import java.util.Scanner;

public class SpiralMatrix {
    static void printMatrix(int[][] Matrix){
        for(int i=0; i<Matrix.length; i++){
            for(int j=0; j<Matrix[i].length; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] matrix,int r,int c){
        int topRow = 0; int buttomRow = r-1; int leftCol = 0; int rightCol = c-1;
        int totalElement = 0;
        while (totalElement<r*c) {
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElement<r*c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElement++;
            }
            topRow++;
            // rightCol -> topRow to buttonRow
            for (int i = topRow; i <= buttomRow && totalElement<r*c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;
            // buttonRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElement<r*c; j--) {
                System.out.print(matrix[buttomRow][j] + " ");
                totalElement++;
            }
            buttomRow--;
            // leftCol -> buttonRow to topRow
            for (int i = buttomRow; i >= topRow && totalElement<r*c; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElement++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of col: ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter the "+r*c+" element: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix: ");
        printMatrix(matrix);
        System.out.println("Spiral Matrix: ");
        printSpiralOrder(matrix,r,c);
        sc.close();
    }
}

/*

OUTPUT:-

Enter the number of row: 5
Enter the number of col: 5
Enter the 25 element:
10 12 14 16 18
20 22 24 26 28
30 32 34 36 38
40 42 44 46 48
50 52 54 56 58
Input Matrix:
10 12 14 16 18
20 22 24 26 28
30 32 34 36 38
40 42 44 46 48
50 52 54 56 58
Spiral Matrix:
10 12 14 16 18 28 38 48 58 56 54 52 50 40 30 20 22 24 26 36 46 44 42 32 34

*/