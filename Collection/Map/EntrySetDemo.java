// entrySet(): returns complete key-value pairs.
// Map.Entry: represents one key-value pair.

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Mahesh");
        students.put(102, "Rahul");
        students.put(103, "Prajwal");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(entry);
        }
    }
}