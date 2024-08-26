package Recursion;//Write a program to remove duplicate character from the String.

public class removeDuplicates {
    public static boolean[] map = new boolean[26];
    public static void remove_Duplicate(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']){
            remove_Duplicate(str, idx+1, newString);
        }else{
            newString += currChar;
            map[currChar-'a'] = true;
            remove_Duplicate(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        remove_Duplicate(str, 0, "");
    }
}
