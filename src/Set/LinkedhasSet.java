package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhasSet {
    public static void main(String[] args) {
        Set<Integer> L_H_S = new LinkedHashSet<>();
        // add element
        // note: it remove automatically duplicate element
        L_H_S.add(20);
        L_H_S.add(30);
        L_H_S.add(50);
        L_H_S.add(60);
        System.out.println("Set: "+L_H_S);
        // remove element
        L_H_S.remove(50);
        System.out.println("New L_H_S: "+L_H_S);
        // contains function
        // it returns boolean value like, true and false
        System.out.println(L_H_S.contains(60));
        // isEmpty() function
        System.out.println("is empty: "+L_H_S.isEmpty());
        // Size() function to check size of L_H_S
        System.out.println("size: "+L_H_S.size());
        // L_H_S clear() function
        L_H_S.clear();
        System.out.println(L_H_S);
        System.out.println("is empty: "+L_H_S.isEmpty());
    }
}
