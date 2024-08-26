package HashMap;
/*
Java HashMap:-
In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have
to access them with an index number (int type). A HashMap however, store items in "key/value" pairs,
and you can access them by an index of another type (e.g. a String).

HashMap Operations:-
1. put()
2. get()
3. remove()
4. clear()
5. keySet()
6. values()
6. size()
7. containsKey()

*/
import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<String, String>();
        // Add key and value
        capitals.put("USA", "Washington D.C.");
        capitals.put("UK", "London");
        capitals.put("Germany", "Berlin");
        capitals.put("India", "New Delhi");
        System.out.println(capitals);
        // get elements
        System.out.println(capitals.get("USA"));
        // remove an items
        capitals.remove("UK");
        System.out.println("After remove UK");
        System.out.println(capitals);
        // remove or clear all the data
        capitals.clear();
        System.out.println("After Clearing All Data");
        System.out.println(capitals);
        // size method
        System.out.println("Size of Map: " + capitals.size());
        // Keyset Method
        System.out.println();
        System.out.println("After putting the data: ");
        capitals.put("Bihar", "Patna");
        capitals.put("M.P.", "Bhopal");
        capitals.put("Jharkhand", "Ranchi");
        capitals.put("India", "New Delhi");
        System.out.println(capitals);
        System.out.println();
        System.out.println("KeySet() method: ");
        for (String i : capitals.keySet()) {
            System.out.println("key : " + i + " and value: " + capitals.get(i));
        }
        System.out.println();
        // values method
        System.out.println("Values() method: ");
        for (String i : capitals.values()) {
            System.out.println(i);
        }
        // searching (containsKey)
        if (capitals.containsKey("India")) {
            System.out.println("Yes, it is present in map");
        } else {
            System.out.println("No, It's not present in map");
        }
        System.out.println(capitals.get("India"));
    }
}
