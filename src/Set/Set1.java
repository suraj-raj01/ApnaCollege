import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // add element
        // note: it remove automatically duplicate element
        set.add(20);
        set.add(30);
        set.add(50);
        set.add(60);
        System.out.println("Set: "+set);
        // remove element
        set.remove(50);
        System.out.println("New set: "+set);
        // contains function
        // it returns boolean value like, true and false
        System.out.println(set.contains(60));
        // isEmpty() function
        System.out.println("is empty: "+set.isEmpty());
        // Size() function to check size of set
        System.out.println("size: "+set.size());
        // set clear() function
        set.clear();
        System.out.println(set);
        System.out.println("is empty: "+set.isEmpty());
    }
}
