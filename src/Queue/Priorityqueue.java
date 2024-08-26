/*
PriorityQueue Class:-
PriorityQueue is also class that is defined in the collection framework that gives us a 
way for processing the objects on the basis of priority. It is already described that the
insertion and deletion of objects follows FIFO pattern in the Java queue. However, 
sometimes the elements of the queue are needed to be processed according to the priority,
that's where a PriorityQueue comes into action.
*/

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class Priorityqueue {
    public static void main(String[] args) {
//      Priorityqueue<Integer> priorityQueue = new PriorityQueue<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>();
//        Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        // add element using offer() method
        priorityQueue.offer(80);
        priorityQueue.offer(10);
        priorityQueue.offer(20);
        priorityQueue.offer(30);
        priorityQueue.offer(40);
        priorityQueue.offer(50);
        System.out.println("Priority Queue: "+priorityQueue);
        // Remove element using poll() method
        System.out.println("removed element: "+priorityQueue.poll());
        System.out.println("New priority queue: "+priorityQueue);
        // peek() method
        System.out.println("Peek element: "+priorityQueue.peek());
        System.out.println("Removed element: "+priorityQueue.poll());
        System.out.println("New priority queue: "+priorityQueue);
    }
}
