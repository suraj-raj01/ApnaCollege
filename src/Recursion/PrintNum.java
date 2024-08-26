package Recursion;//Write a program to print number in reverse order.

//public class PrintNum  {
//    public static void PrintNumber(int n){
//        if(n!=0){
//            System.out.println(n);
//            PrintNumber(n-1);
//        }
//        else{
//            return;
//        }
//    }
//    public static void main(String[] args) {
//        PrintNumber(10);
//    }
//}


//Write a program to print number in increasing order.

//public class PrintNum {
//    public static void PrintNumber(int n){
//        if(n>10){
//            return;
//        }
//        else{
//            System.out.println(n);
//            PrintNumber(n+1);
//        }
//    }
//    public static void main(String[] args) {
//        PrintNumber(1);
//    }
//}

// Write a program using recursion to print table of a number

import java.util.Scanner;

public class PrintNum {
    public static void printTable(int n, int table){
        if(n>10){
            return;
        }
        else{
            System.out.println(table+"*"+n+" = "+n*table);
            printTable(n+1,table);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        printTable(1,n);
        sc.close();
    }
}