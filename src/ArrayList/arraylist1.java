package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("F");
        list.add("D");
        list.add("E");
        System.out.println(list);
        //to get an element
        String str=list.get(2);
        System.out.println(str);
        //add element
        list.set(3,"Z");
        System.out.println(list);
        //set element
        list.set(0,"S");
        System.out.println(list);
        //delete / remove element
        list.remove(0);
        System.out.println(list);
        //add element
        list.add(0,"A");
        System.out.println(list);
        //size of list
        int size=list.size();
        System.out.println(size);
        //loop on lists
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //sorting the list
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        // Collections.sort(list, String::compareToIgnoreCase); 
        System.out.println("After sorting: " + list);
    }
}
