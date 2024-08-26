package Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        Set<Integer> treeHset = new TreeSet<>();
        // add element
        // note: it remove automatically duplicate element
        treeHset.add(20);
        treeHset.add(80);
        treeHset.add(50);
        treeHset.add(60);
        System.out.println("Set: "+treeHset);
        // remove element
        treeHset.remove(50);
        System.out.println("New treeSet: "+treeHset);
        // contains function
        // it returns boolean value like, true and false
        System.out.println(treeHset.contains(30));
        // isEmpty() function
        System.out.println("is empty: "+treeHset.isEmpty());
        // Size() function to check size of treeSet
        System.out.println("size: "+treeHset.size());
        // treeHset clear() function
        treeHset.clear();
        System.out.println(treeHset);
        System.out.println("is empty: "+treeHset.isEmpty());
    }
}
