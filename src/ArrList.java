import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

// add some integers to the list
        list.add(10);
        list.add(20);
        list.add(30);

// retrieve an element from the list
        int element = list.get(1);
        System.out.println(element);

// remove an element from the list
        list.remove(1);

// loop through the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}


// create an ArrayList to store integers
