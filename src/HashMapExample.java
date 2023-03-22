import java.util.HashMap;

//In this example, we create a new HashMap to store string keys and integer values.
// We add some key-value pairs to the map using the put() method,
//and retrieve a value from the map using the get() method. We also loop through the keys
// and values in the map using a for-each loop and the keySet() and get() methods.

public class HashMapExample {
    public static void main(String[] args) {
        // create a new HashMap to store string keys and integer values
        HashMap<String, Integer> map = new HashMap<>();

        // add some key-value pairs to the map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // retrieve a value from the map using a key
        int age = map.get("Bob");
        System.out.println("Bob's age is " + age);

        // loop through the keys and values in the map
        for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println(key + " is " + value + " years old");
        }
    }
}


