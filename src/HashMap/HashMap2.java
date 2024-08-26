import java.util.HashMap;
public class HashMap2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4, "D");
        System.out.println(map);
        // get value by key
        System.out.println("Value for Key 2 is: "+map.get(2));
        map.put(5,"E");
        System.out.println(map);
        System.out.println("Value for Key 5 is: "+map.get(5));
        map.size();
        System.out.println("Size of map: "+map);
        map.clear();
        System.out.println("Empty map: "+map);
    }
}
