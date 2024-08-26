package Queue;/*
Java Queue Interface:-
The interface Queue is available in the java.util package and does extend the Collection 
interface. It is used to keep the elements that are processed in the First In First Out 
(FIFO) manner. It is an ordered list of objects, where insertion of elements occurs at 
the end of the list, and removal of elements occur at the beginning of the list.
*/
import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //we use offer for add the element
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        // we can also use add method for add the element
        queue.add(60);
        System.out.println(queue);
        //remove element using poll and remove method
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue);
        //peek method and element method
        System.out.println(queue.peek());
        System.out.println(queue.element());
    }
}
