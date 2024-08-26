package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        // Adding elements to the List
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println(list);
        Scanner sc = new Scanner(System.in);
        System.out.print("Search the number from the list: ");
        int num = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (num == list.get(i)) {
                System.out.println("Number found at index " + i);
            } else {
               continue;
            }
        }
        sc.close();
    }
}
