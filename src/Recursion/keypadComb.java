package Recursion;//Write a program to print keypad combination

import java.util.Scanner;
public class keypadComb {

    public static String[] keypad = {"_,@","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printComb(String str, int idx, String combination){

        if(idx==str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for(int i=0; i<mapping.length(); i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the keypad button: ");
        String str = sc.next();
        printComb(str, 0, "");
        sc.close();
    }
}
