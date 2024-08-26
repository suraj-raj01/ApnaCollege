package Stack;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

public class Stack2 {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.push(60);
        list.push(70);
        System.out.println("Stack: "+list);
        System.out.println("Stack: "+list.peek());
        list.pop();
        System.out.println("Stack: "+list);
        System.out.println("Stack: "+list.peek());
        Stack<Integer> list2 = new Stack<>();
        list2.push(100);
        list2.push(200);
        list2.push(300);
        list.addAll(list2);
        System.out.println("Stack: "+list);
        // iterative method 1
        System.out.println("\nIterative method 1");
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("\nIterative method 2");
        //iterative method 2
        for (Integer integer : list) {
            System.out.println(integer);
        }
        //iterative method 3
        System.out.println("\nIterative method 3");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //For String items
        Stack<String> list3 = new Stack<>();
        list3.push("S");
        list3.push("U");
        list3.push("R");
        list3.push("A");
        list3.push("J");
        System.out.println(list3);
        Stack<String> list4 = new Stack<>();
        list4.push("A");
        list4.push("R");
        list4.push("Y");
        list4.push("A");
        list3.addAll(list4);
        System.out.println("After adding: "+list3);
        // using loop
        for(int i=0; i<list3.size(); i++){
            System.out.println(list3.get(i));
        }
     list3.clear();
        System.out.println("After remove all item: "+list3);
    }
}
