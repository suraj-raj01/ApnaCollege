package ArrayList;//Collections Framework

import java.util.Collections;
import java.util.ArrayList;
public class arraylist2{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(3);
        System.out.println("print arraylist: "+arr);
        Collections.sort(arr);
        System.out.println("sorted arraylist: "+arr);
        Collections.reverse(arr);
        System.out.println("reverse arraylist: "+arr);
        Collections.shuffle(arr);
        System.out.println("shuffle arraylist: "+arr);
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(25);
        arr1.add(30);
        arr1.add(23);
        // we can add one arraylist to another arraylist
        arr.addAll(arr1);
        System.out.println("new arraylist is: "+arr);
        // contains method in arraylist
        System.out.println(arr.contains(6));
        System.out.println(arr.contains(15));
        ArrayList<String> list = new ArrayList<>();
        list.add("G");
        list.add("B");
        list.add("T");
        list.add("V");
        list.add("D");
        list.add("S");
        System.out.println("Original Strings");
        System.out.print(list+" ");
        System.out.println();
        System.out.println("Reverse Strings");
        Collections.reverse(list);
        System.out.print(list+" ");
        System.out.println();
        System.out.println("sorted String");
        Collections.sort(list);
        System.out.println(list+" ");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Reverse order");
        System.out.print(list+" ");

    }
}
