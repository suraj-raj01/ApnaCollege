package HashSet;

import java.util.HashSet;
public class hashSet2 {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        // add integer value in HashSet
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        if (list.contains(6)){
            System.out.println("Contains 6");
        }
        else{
            System.out.println("Does not contain 6");
        }
        // loop through hashSet
        System.out.println("loop through HashSet: ");
        System.out.println();
        for (int i : list){
            System.out.println(i);
        }
        // remove element from set
        list.remove(3);
        System.out.println("\nAfter removing 3: "+list);
        // check size of HashSet
        int size=list.size();
        System.out.println("Size is: "+size);
        // clear the Hashset
        list.clear();
        System.out.println("Cleared HashSet: "+list);
    }
}
