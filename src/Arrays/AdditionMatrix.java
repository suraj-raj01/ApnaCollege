package Arrays;

import java.util.Scanner;

public class AdditionMatrix {
    void Addition(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of col: ");
        int c = sc.nextInt();
        int [][]a = new int[r][c];
        int [][]b = new int[r][c];
        int [][]c1 = new int[r][c];
        int [][]sum = new int[r][c];
        // first matrix input
        System.out.println("Enter the "+r*c+" element of first Matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j] = sc.nextInt();
            }
        }
        // second matrix input
        System.out.println("Enter the "+r*c+" element of second Matrix: ");
        for(int i=0; i<r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        // third matrix input
        System.out.println("Enter the "+r*c+" element of third Matrix: ");
        for(int i=0; i<r; i++) {
            for (int j = 0; j < c; j++) {
                c1[i][j] = sc.nextInt();
            }
        }
        System.out.println("The sum is: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                sum[i][j] = a[i][j] + b[i][j] +c1[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        AdditionMatrix myObj = new AdditionMatrix();
        myObj.Addition();
    }
}

/*
//OUTPUT:-

Enter the number of row: 3
Enter the number of col: 3
Enter the 9 element of first Matrix:
1 2 3
4 5 6
7 8 9
Enter the 9 element of second Matrix:
9 8 7
6 5 4
3 2 1
Enter the 9 element of third Matrix:
1 2 3
4 5 6
7 8 9
The sum is:
11 12 13
14 15 16
17 18 19

*/