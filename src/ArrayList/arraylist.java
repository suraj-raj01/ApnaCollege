package ArrayList;/*
ArrayList:-
An ArrayList in Java is a resizable-array implementation of the List interface, backed by an array.
Arrays have fixed size and cannot grow or shrink during runtime.
To overcome this limitation, we use ArrayList which can dynamically increase its capacity to store 
more elements when it gets full.

Operations:-
1. Declare an arraylist of different types
2. Add element into the list
3. Get element from the list
4. Set element into list
5. delete element from the list
6. get size of list
7. Loop / iterate on the list
8. Sort the list
9. Search for an item in the list
*/

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        //Integer type arrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Adding elements into the ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        // To get an element
        int element = list.get(3);
        System.out.println("Element at index 3 is " + element);
        // add element
        System.out.println("add element at index 1");
        list.add(1, 4);
        System.out.println(list);
        // set element
        System.out.println("set element at index 0");
        list.set(0, 5);
        System.out.println(list);
        // delete or remove
        System.out.println("remove element at index 1");
        list.remove(1);
        System.out.println(list);
        // remove element directly (without passing index)
        System.out.println("remove element 4 (without passing index)");
        list.remove(Integer.valueOf(4));
        System.out.println(list);
        // size of list
        System.out.println("size of list");
        int size = list.size();
        System.out.println(size);
        // loop on list
        System.out.println("print list using loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        // sorting the list
        list.add(0);
        System.out.println("add 0 into the list");
        System.out.println(list);
        System.out.println("sort the element using collections");
        Collections.sort(list);
        System.out.println(list);
    }
}

/*
OUTPUT:-
[1, 2, 3, 4]
Element at index 3 is 4
add element at index 1
[1, 4, 2, 3, 4]
set element at index 0
[5, 4, 2, 3, 4]
remove element at index 1
[5, 2, 3, 4]
size of list
4
print list using loop
5 2 3 4 
add 0 into the list
[5, 2, 3, 4, 0]
sort the element using collections
[0, 2, 3, 4, 5]
*/