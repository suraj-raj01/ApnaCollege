package Recursion;//Write a program to implement subsequence of a string

public class subSequence{
    public static void subSequences(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subSequences(str, idx+1, newString+currChar);
        subSequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSequences(str, 0, "");
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

