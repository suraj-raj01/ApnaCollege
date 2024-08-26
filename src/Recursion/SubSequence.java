package Recursion;
//Write a program to implement subsequence of a string

public class SubSequence {
    public static void subSequence(String str,int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subSequence(str,idx+1,newString+currChar);
        subSequence(str,idx+1,newString);
    }
    public static void main(String[] args) {
        String str = "ABC";
        subSequence(str,0,"");
    }
}

/*
 * Output:-
 * 
 * abc
 * ab
 * ac
 * a
 * bc
 * b
 * c
 */

