import java.util.Scanner;

public class TransposeMatrix {
    void PrintTransposeMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of col: ");
        int c = sc.nextInt();
        int[][] Matrix = new int[r][c];

        System.out.println("Enter the "+r*c+" elements: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix is: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }

        int [][]TransPose = new int[c][r];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                TransPose[i][j] = Matrix[j][i];
            }
        }
        System.out.println("Transpose Matrix is: ");
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                System.out.print(TransPose[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        TransposeMatrix matrix = new TransposeMatrix();
        matrix.PrintTransposeMatrix();
    }
}

/*
OUTPUT:-

Enter the number of row: 3
Enter the number of col: 3
Enter the 9 elements:
1 2 3
4 5 6
7 8 9
Original Matrix is:
1 2 3
4 5 6
7 8 9
Transpose Matrix is:
1 4 7
2 5 8
3 6 9

*/