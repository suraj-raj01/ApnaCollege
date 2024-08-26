package Map;

import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        // add the element but in sorted manner
        tm.put(0," A ");
        tm.put(3," B ");
        tm.put(2," C ");
        tm.put(1," D ");
        tm.put(4," E ");
        System.out.println(tm);
        // remove element using remove() function
        tm.remove(0);
        System.out.println(tm);
        // contains key
        System.out.println("ContainsKey: "+tm.containsKey(4));
        System.out.println("Get: "+tm.get(4));
        tm.putIfAbsent(0," Z ");
        System.out.println(tm);
        tm.put(0,"D");
        System.out.println(tm);
    }
}
