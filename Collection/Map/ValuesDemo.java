//values() returns all values from the map.

import java.util.Collection;
import java.util.HashMap;

public class ValuesDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Mahesh");
        students.put(102, "Rahul");
        students.put(103, "Prajwal");

        Collection<String> values = students.values();

        System.out.println(values);
    }
}