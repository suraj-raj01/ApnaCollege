public class TwoD_arr1 {
    // simple 2D array
    public void print2D_arr1(){
        int[][] arr = {{1,2,3,4},{2,4,6,8}};
        System.out.print(arr[0][0]+" ");
        System.out.print(arr[0][1]+" ");
        System.out.print(arr[0][2]+" ");
        System.out.print(arr[0][3]+" ");
        System.out.println();
        System.out.print(arr[1][0]+" ");
        System.out.print(arr[1][1]+" ");
        System.out.print(arr[1][2]+" ");
        System.out.print(arr[1][3]+" ");
    }

    // using loop to print 2D array
    void print2D_arr2(){
       int [][]arr = {{2,4,6,8},{1,3,5,7}};
        System.out.println("\n---------------------");
       for(int i=0; i<2; i++) {
           for (int j = 0; j < 4; j++) {
               System.out.println("arr["+i+"]["+ j +"] = "+arr[i][j]);
           }
           System.out.println();
       }
    }
    void print2D_arr3(){
        int i=0;
        int [][]arr = {{3,4,5,8},{2,3,6,7}};
        System.out.println("---------------------");
        while(i<2) {
            for (int j = 0; j < 4; j++) {
                System.out.println("arr["+i+"]["+ j +"] = "+arr[i][j]);
            }
            i++;
            System.out.println();
        }
        System.out.println("---------------------");
    }

    // Print array with multiple row and columns.
    void print2D_arr4(){
        int [][] arr= {{1,2,3,4},{4,5,6,7},{7,8,9,3},{3,6,9,2},{2,5,8,9}};
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        TwoD_arr1 myObj = new TwoD_arr1();
        myObj.print2D_arr1();
        myObj.print2D_arr2();
        myObj.print2D_arr3();
        myObj.print2D_arr4();
    }
}

