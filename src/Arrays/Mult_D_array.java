package Arrays;

public class Mult_D_array {

    // Print multiple array using loops
    void printMult_D_arr1(){
        int[][][] arr = {{{1,2,3},{3,4,5}},
                         {{7,8,9},{6,5,4}},
                         {{1,4,7},{6,2,8}}};
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                for(int k=0; k<3; k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    // Multidimensional String array
    void printMult_D_arr2(){
        String[][] arr = {{"Suraj Kumar","Rajan Kumar","Rahul Kumar","Hariom Kumar"},
                          {"Mohan Kumar","Vinod Kumar","Mukesh Kumar","Rakesh Kumar"}};
        System.out.println("--------------");
        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                    System.out.println(arr[i][j]+" ");
            }
            System.out.println("--------------");
        }
    }
    public static void main(String[] args) {
        Mult_D_array myObj = new Mult_D_array();
        myObj.printMult_D_arr1();
        myObj.printMult_D_arr2();
    }
}
