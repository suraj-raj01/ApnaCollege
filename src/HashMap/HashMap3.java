package HashMap;

import java.util.HashMap;
public class HashMap3 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> list = new HashMap<>();
        list.put(1,100);
        list.put(2,200);
        list.put(3,300);
        list.put(4,400);
        list.put(5,500);
        System.out.println(list);
        System.out.println(list.get(2));
        int size = list.size();
        System.out.println("size of list: "+size);
        list.remove(3);
        System.out.println("After remove key 3 : "+list);
        list.put(3,300);
        System.out.println("After putting key 3: "+list);
        list.clear();
        System.out.println("after clear the list: "+list);
        list.remove(1,100);
        System.out.println(list);
    }
}
