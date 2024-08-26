//Write a program to print the Fibonacci Series.

import java.util.Scanner;

public class Fibonacci {
  public static void print_fibo(int a, int b, int n){
      if(n==0){
          return;
      }
      int c = a+b;
      System.out.print(c+" ");
      print_fibo(b,c,n-1);
  }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        print_fibo(a,b,n-2);
        scanner.close();
    }
}