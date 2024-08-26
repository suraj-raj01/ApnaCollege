
import java.util.LinkedList;
import java.util.Queue;

public class queue2 {
    public static void main(String[] args) {
        Queue<String> list = new LinkedList<>();
        // Add the element using offer() method
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        list.offer("E");
        list.offer("F");
        list.add("G");
        System.out.println("Queue element: "+list);
        // remove the element using poll() operation
        System.out.println("Removed element: "+list.poll());
        System.out.println("New queue element: "+list);
        //peek() element
        System.out.println(list.peek());
        System.out.println(list.element());
        list.clear();
        System.out.println(list);
        list.offer("S");
        list.offer("U");
        list.offer("R");
        list.offer("A");
        list.offer("J");
        System.out.println(list);
    }
}
