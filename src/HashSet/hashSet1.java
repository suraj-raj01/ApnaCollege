package HashSet;
/*
Java HashSet
A HashSet is a collection of items where every item is unique, and it is found in the
java.util package:
* */
import java.util.HashSet;

public class hashSet1 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        // Adding elements to the set
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Ferrari");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars); // [BMW, Mercedes, Ferrari, Volvo, Ford]
        // Checking if an element exists in the set
        // System.out.println(cars.contains("Volvo")); //true
        boolean bmwExists = cars.contains("BMW");
        System.out.println(bmwExists); // true
        // remove an element
        cars.remove("BMW");
        System.out.println(cars); // [Mercedes, Ferrari, Volvo, Ford, Mazda]
        // size() method
        int carCount = cars.size();
        System.out.println(carCount); // 5
        // clear() method
        cars.clear();
        System.out.println(cars); // []
        System.out.println("After adding value again : ");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Bolero");
        cars.add("Volvo");
        cars.add("Suzuki");
        cars.add("venue");
        System.out.println(cars);
        System.out.println();
        System.out.println("loop through HashSet: ");
        // Loop through a HashSet
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println();
    }
}
