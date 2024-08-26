import java.util.Scanner;

public class arr2 {
    // Take input from user
    void printArr1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the "+n+" element: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Entered element was: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    // string array
    void printArr2(){
        String arr[] = {"Suraj","Rajan","Rahul","Mohan","Hariom"};
        System.out.println("\nArray element is: ");
        for(String str : arr){
            System.out.println(str);
        }
    }

    // Take String input from user
    void printArr3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of arr: ");
        int n = scanner.nextInt();
        String arr[] = new String[n];
        System.out.println("Enter name of "+n+" student: ");
        // for loop
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.next();
        }

        System.out.println("Entered name was: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        scanner.close();
    }
    // Print table of a number.
    void printTable(){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number whose table is required: ");
        int n = scanner.nextInt();
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]*n;
            System.out.println(arr[i]);
        }
        scanner.close();
    }
    public static void main(String[] args) {
        arr2 myArr = new arr2();
        myArr.printArr1();
    //    myArr.printArr2();
    //    myArr.printArr3();
    //    myArr.printTable();
    }
}
