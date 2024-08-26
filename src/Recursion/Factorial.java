package Recursion;//Write a program to implement Factorial of a number.

import java.util.Scanner;

public class Factorial {
    public static int CalcFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*CalcFactorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        System.out.println("factorial is: "+CalcFactorial(n));
        scanner.close();
    }
}