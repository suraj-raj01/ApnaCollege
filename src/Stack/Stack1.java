package Stack;/*
What is a Stack:-
A Stack is a linear data structure that follows the LIFO (Last-In-First-Out) 
principle. This means, the last element inserted into the stack will be 
the first one to be removed or popped out of it. It allows two main operations
push and pop. Push inserts an element onto the top of the stack whereas pop 
removes the element from the top of the stack. In addition to these basic
operations, peek operation can also be performed which returns the topmost
element without removing it from the stack.
*/

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;
public class Stack1 {
    public static void main(String[] args) {
         Stack<String> animal = new Stack<>();
         //Push method
         animal.push("Lion");
         animal.push("Tiger");
         animal.push("dog");
         animal.push("horse");
         animal.push("cat");
         System.out.println(animal);
         // Peek Method
         System.out.println("Peek: "+animal.peek());
         // Pop Method
         animal.pop();
         System.out.println("After popped: "+animal);
         System.out.println("Peek: "+animal.peek());
         Stack<Integer> list = new Stack<>();
         list.push(20);
         list.push(4);
         list.push(60);
         list.push(8);
         list.push(10);
         System.out.println("list: "+list);
         Collections.sort(list);
         System.out.println("In sorted Manner: "+list);
         System.out.println("peek: "+list.peek());
         // pop() it means remove the element from list
         System.out.println("Pop: "+list.pop());
         System.out.println("new list: "+list);
         // using iteration in
         System.out.println("using iteration:-");
         for (Integer integer: list
              ) {
              System.out.println("--> "+integer);
         }
    }
}
