import java.util.Collections;
import java.util.LinkedList;
public class Linked_List4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // Adding elements to the linked list
        for (int i=0;i<=10;i++){
            list.add(i);
        }
        System.out.println();
        System.out.println("Original List: "+list);
        // Removing element from the linked list using remove method
        list.removeLast();
        list.removeFirst();
        System.out.println("Modified List after removing first and last element: "+list);
        // reverse the list
        Collections.reverse(list);
        System.out.println("Reversed List: "+list);
        // Shuffle element of list
        Collections.shuffle(list);
        System.out.println("Shuffled List: "+list);
        System.out.println();
    }
}
