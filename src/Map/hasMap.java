package Map;

import java.util.HashMap;
import java.util.Map;

public class hasMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        if(!map.containsKey(6)){
            map.put(6,"F");
        }
        map.putIfAbsent(5,"E");
        System.out.println("Maps: "+map);
        System.out.println("Size of map: "+map.size());
        // iterate for key
        System.out.println("----------------\nkeys: ");
        for(Integer key:map.keySet()){
            System.out.println(key);
        }
        // iterate for value
        System.out.println("-----------------\nValues: ");
        for(String value:map.values()){
            System.out.println(value);
        }
        // contains key to check key is present or not
        System.out.println("-------------------");
        System.out.println(map.containsKey(4));
        System.out.println(map.containsKey(7));
        // contains value to check value is present or not in map
        System.out.println("---------------------");
        System.out.println(map.containsValue("C"));
        System.out.println(map.containsValue("E"));
        // isEmpty() function to check map is empty or not
        System.out.println("---------------------");
        System.out.println("is empty: "+map.isEmpty());
        map.clear();
        System.out.println("new map: "+map);
        System.out.println("is empty: "+map.isEmpty());
    }
}
