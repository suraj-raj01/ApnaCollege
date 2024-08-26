package Arrays;

import java.util.Scanner;

public class TwoD_arr2 {

    // Print 2D arrays
    void print2D_arr1(){
        int[][] arr = {{1,2,3,4},{4,5,6,7},{7,8,9,8},{8,5,2,7}};
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    // take input from user in 2D array
    void print2D_arr2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of column: ");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("Enter the element at index [" + i + "][" + j+"] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nThe entered element is:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static void main(String[] args) {
       TwoD_arr2 myObj = new TwoD_arr2();
       myObj.print2D_arr1();
       myObj.print2D_arr2();
    }
}
