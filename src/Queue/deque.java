package Queue;/*
Java Deque Interface:-
The interface called Deque is present in java.util package. It is the subtype of the 
interface queue. The Deque supports the addition as well as the removal of elements from 
both ends of the data structure. Therefore, a deque can be used as a stack or a queue. 
*/
import java.util.ArrayDeque;

public class deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        // add element using offer() method
        dq.offer(2);
        // add element in first
        dq.offerFirst(4);
        // add element in last
        dq.offerLast(6);
        dq.offer(10);
        System.out.println(dq);
        // see element using peek() method
        System.out.println("peek: "+dq.peek());
        System.out.println("peek first: "+dq.peekFirst());
        System.out.println("peek last: "+dq.peekLast());

        // remove element using poll() method
        System.out.println("poll: "+dq.poll());
        System.out.println("poll first: "+dq.pollFirst());
        System.out.println("poll last: "+dq.pollLast());
    }
}
