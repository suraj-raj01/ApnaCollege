package Recursion;//print a string in reverse order?

public class String_reverse {
    public static void print_rev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        print_rev(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        print_rev(str, str.length() - 1);
    }
}
