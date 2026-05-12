// keySet() :- This methods return all keys 

import java.util.HashMap;
import java.util.Set;

public class KeySetDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Mahesh");
        students.put(102, "Shreyash");
        students.put(103, "Prajwal");

        // Getting all keys
        Set<Integer> keys = students.keySet();

        System.out.println(keys);
    }
}