// Write a program to implement unique sub sequence using recursion.

import java.util.HashSet;

public class uniqueSubsequence {
    public static void subSequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        // if can be
        char currChar = str.charAt(idx);
        subSequences(str, idx + 1, newString + currChar, set);

        // if can not be
        subSequences(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        subSequences(str, 0, "", set);
    }
}