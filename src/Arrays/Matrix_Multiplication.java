package Arrays;

import java.util.Scanner;

public class Matrix_Multiplicatin {
    void MatrixMultiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of first Matrix: ");
        System.out.print("Enter the number of rows: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of column: ");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        int[][] multiplication = new int[r1][c1];
        System.out.println("Enter the " + r1 * c1 + " element of first Matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the numbers of Second Matrix: ");
        System.out.print("Enter the number of rows: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of column: ");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter the " + r2 * c2 + " element of second Matrix: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        if (c1 != r2) {
            System.out.println("Multiplication is not possible!!");
            System.exit(0);
        } else {

            System.out.println("The Resultant Matrix is: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        multiplication[i][j] += (a[i][k]) * (b[k][j]);
                    }
                }
            }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                        System.out.print(multiplication[i][j] + " ");
                    }
                    System.out.println();
            }
            sc.close();
        }
    }
    public static void main(String[] args) {
        Matrix_Multiplicatin matrix = new Matrix_Multiplicatin();
        matrix.MatrixMultiplication();
    }
}

/*

OUTPUT:-

Enter the number of rows: 3
Enter the number of column: 3
Enter the 9 element of first Matrix:
1 2 3
4 5 6
7 8 9
Enter the number of rows: 3
Enter the number of column: 2
Enter the 6 element of second Matrix:
1 2
2 3
3 4
The Resultant Matrix is:
14 20
32 47
50 74

*/