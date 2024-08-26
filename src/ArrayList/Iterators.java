import java.util.ArrayList;
import java.util.Iterator;
public class Iterators {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(5);
        list.add(11);
        list.add(4);
        System.out.println(list);
        // iterator method
        Iterator<Integer> it = list.iterator();
        System.out.println(it.next());
        // Looping through a Collections
        System.out.println("Looping through a collections");
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        // Removing item from a collections
        while(it.hasNext()){
            Integer i = it.next();
            if(i>10){
                it.remove();
            }
        }
        System.out.println(list);
        str.add("A");
        str.add("B");
        str.add("C");
        str.add("D");
        System.out.println(str);
        Iterator<String> StrItr = str.iterator();
    //    System.out.println(StrItr.next());
        while(StrItr.hasNext()){
            System.out.print(StrItr.next()+" ");
        }
    }
}
