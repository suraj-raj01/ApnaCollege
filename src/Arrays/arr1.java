package Arrays;

public class arr1 {

    //simple method
    void printArr1(){
        int arr[] = {2,5,4,6,9,8,7};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
    }

    // using for loop method
    void printArr2(){
        int arr[] = {2,4,5,6,9,8,7,3};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //using while loop method
    void printArr3(){
        int arr[] = {2,5,4,7,9,6,3,8};
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
    }

    //using do while loop method
    void printArr4(){
        int arr[] = {2,4,6,8,10,12};
        int i=0;
        do{
            System.out.print(arr[i]+" ");
            i++;
        }while(i<arr.length);
    }

    //using for each loop method
    void printArr5(){
        int arr[] = {1,2,3,4,5,6,7,8};
        for(int val : arr){
            System.out.print(val+" ");
        }
    }

    public static void main(String[] args) {
       arr1 myArr1 = new arr1();
//       myArr1.printArr1();
//       myArr1.printArr2();
//       myArr1.printArr3();
//       myArr1.printArr4();
      myArr1.printArr5();
    }
}


