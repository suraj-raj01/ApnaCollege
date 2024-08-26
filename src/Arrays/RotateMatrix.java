package Arrays;

import java.util.Scanner;

public class RotateMatrix {
    void RotationMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of col: ");
        int c1 = sc.nextInt();
        int[][] Matrix = new int[r1][c1];
        if(r1!=c1){
            System.out.println("not possible!");
        }else {
            System.out.println("Enter the " + r1 * c1 + " element: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    Matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Original Matrix is: ");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    System.out.print(Matrix[i][j]+" ");
                }
                System.out.println();
            }
            // Transpose Matrix
            int[][] transpose = new int[c1][r1];
            for (int i = 0; i < c1; i++) {
                for (int j = 0; j < r1; j++) {
                    transpose[i][j] = Matrix[j][i];
                }
            }
            System.out.println("Transpose Matrix:");
            for (int i = 0; i < c1; i++) {
                for (int j = 0; j < r1; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }
            // Rotate Matrix
            System.out.println("Rotated Matrix: ");
            for(int i=0; i<r1; i++){
                int start = 0;
                int end = r1-1;
                while(start<end){
                    int temp = transpose[i][start];
                    transpose[i][start] = transpose[i][end];
                    transpose[i][end]  = temp;
                    start++;
                    end--;
                }
            }
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    System.out.print(transpose[i][j]+" ");
                }
                System.out.println();
            }
            sc.close();
        }
    }
    public static void main(String[] args) {
        RotateMatrix matrix = new RotateMatrix();
        matrix.RotationMatrix();
    }
}

/*
OUTPUT:-

Enter the number of row: 4
Enter the number of col: 4
Enter the 16 element:
1 2 3 4
4 5 6 7
7 8 9 5
6 5 4 7
Transpose Matrix:
1 4 7 6
2 5 8 5
3 6 9 4
4 7 5 7
Rotated Matrix:
6 7 4 1
5 8 5 2
4 9 6 3
7 5 7 4

*/