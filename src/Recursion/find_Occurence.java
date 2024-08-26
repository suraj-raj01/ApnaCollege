//Write a program to find the occurence
public class find_Occurence {
    public static int first = -1;
    public static int last = -1;

    public static void find_occur(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.print(first+" ");
            System.out.print(last);
            return;
        }
        char CurrCharacter = str.charAt(idx);
        if (CurrCharacter == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        find_occur(str, idx + 1, element);
    }

    public static void main(String[] args) {

        String str = "sacdaabaacdaefaah";
        find_occur(str, 0, 'a');

    }
}
