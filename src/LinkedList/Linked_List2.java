// This is the String type linkedList
// implement some method like addFirst, addLast, remove and more..
import java.util.LinkedList;
public class Linked_List2 {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<String>();
        str.addFirst("suarj");
        str.addFirst("name");
        str.addFirst("my");
        System.out.println(str);
        str.add(2,"is");
        System.out.println(str);
        str.set(3,"Suraj Arya");
        System.out.println(str);
        str.remove(2);
        System.out.println(str);
        str.clear();
        System.out.println("Clear the arraylist");
        System.out.println(str);
        str.add("Arya");
        str.addFirst("Suraj");
        System.out.println(str);
    }
}
