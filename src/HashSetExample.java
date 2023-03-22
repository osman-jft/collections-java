import java.util.HashSet;

//In this example, we create a new HashSet to store string elements. We add some elements to the set using the add() method,
// and try to add a duplicate element to the set to demonstrate that duplicates are not allowed.
// We remove an element from the set using the remove() method, and check if an element is


public class HashSetExample {
    public static void main(String[] args) {
        // create a new HashSet to store string elements
        HashSet<String> set = new HashSet<>();

        // add some elements to the set
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("pear");

        // try to add a duplicate element to the set
        boolean result = set.add("apple");
        System.out.println("Result of adding duplicate element: " + result);

        // remove an element from the set
        set.remove("orange");

        // check if an element is in the set
        boolean contains = set.contains("banana");
        System.out.println("Set contains banana: " + contains);

        // loop through the elements in the set
        for (String element : set) {
            System.out.println(element);
        }
    }
}

