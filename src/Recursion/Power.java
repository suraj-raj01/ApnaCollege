package Recursion;//Write a program to implement X to the power n.

import java.util.Scanner;
public class Power {
    public static int CalcPow(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        return x*(CalcPow(x,n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent number: ");
        int exponent = sc.nextInt();
        int result = CalcPow(base,exponent);
        System.out.println("The result is: "+result);
        sc.close();
    }
}
