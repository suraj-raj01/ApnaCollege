package Recursion;//Write a program to print the sum of n natural number?
import java.util.Scanner;
public class PrintSum {
    public static void printSum(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum +=n;
        printSum(n-1,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("The sum of "+n+" is: ");
        printSum(n,0);
        sc.close();
    }
}

// public class PrintSum {
//     public static void printSum(int i,int n, int sum){
//         if(i==n){
//             sum+=i;
//             System.out.println(sum);
//             return;
//         }
//         sum+=i;
//         printSum(i+1,n,sum);
//     }
//     public static void main(String[] args) {
//         printSum(1, 5, 0);
//     }
// }