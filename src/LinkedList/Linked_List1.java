package LinkedList;/*
Java LinkedList:-
A linked list is a linear data structure where each element is a separate object.
In the previous chapter, you learned about the ArrayList class. The LinkedList class is almost 
identical to the ArrayList:

LinkedList Method:-
For many cases, the ArrayList is more efficient as it is common to need access to random items in 
the list, but the LinkedList provides several methods to do certain operations more efficiently:

1. addFirst()
2. addLast()
3. removeFirst()
4. removeLast()
5. getFirst()
6. getLast()
*/
import java.util.LinkedList;
import java.util.Collections;
public class Linked_List1 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        // Adding elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        //Get element from the list
        int getElement = list.get(2);
        System.out.println(getElement);
        // set the element
        list.set(0,5);
        System.out.println(list);
        // Size of list
        int size=list.size();
        System.out.println(size);
        // Remove an element
        list.remove(2);
        System.out.println(list);
        // Loop on list
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        //Sorting the list
        Collections.sort(list);
        System.out.println(list);
        //clear the list
        list.clear();
        System.out.println("clear all the elements");
        System.out.println(list);
        list.add(0,4);
        list.add(1,2);
        list.add(2,8);
        System.out.println("After adding some values");
        System.out.println(list);
        // clear the list
        list.clear();
        System.out.println("after clearing the list");
        System.out.println(list);
        // Add first add Last elements
        System.out.println("add some elements");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println("add first and last element");
        list.addFirst(0);
        list.addLast(5);
        System.out.println(list);
        // remove first and remove last elements
        System.out.println("remove first and last element");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        // get first and get last elements
        System.out.println("first element is "+list.getFirst());
        System.out.println("last element is "+list.getLast());
    }
}
