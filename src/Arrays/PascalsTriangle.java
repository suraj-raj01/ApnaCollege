import java.util.Scanner;

public class PascalsTriangle {
    // first Method
    static void printMatrix(int[][] Matrix){
        for(int i=0; i<Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] pascals(int n){
     int[][] ans = new int[n][];
     for(int i=0; i<n; i++){
         // ith row has i+1 column
         ans[i] = new int[i+1];
         //first answer last element of every row is 1.
         ans[i][0] = ans[i][i] = 1;
         for(int j=1; j<i; j++){
             ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
         }
     }
     return ans;
    }

    //second Method
    void printPascals(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int n = sc.nextInt();
        int [][]p = new int[n][];
        for(int i=0; i<n; i++){
           p[i] = new int[i+1];
           p[i][0] = p[i][i] = 1;
           for(int j=1; j<i; j++){
               p[i][j] = p[i-1][j]+p[i-1][j-1];
           }
        }

        for(int i=0; i<p.length; i++){
            for(int j=0; j<p[i].length; j++){
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        //first Method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int[][] ans = pascals(n);
        printMatrix(ans);
        // second Method
        PascalsTriangle myObj = new PascalsTriangle();
        myObj.printPascals();
        sc.close();
    }
}

/*
//OUTPUT:-

Enter the number of rows: 5
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
Enter the number of row: 6
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

*/