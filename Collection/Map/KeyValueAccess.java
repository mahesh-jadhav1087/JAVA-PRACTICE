// Access Values Using Keys

import java.util.HashMap;

public class KeyValueAccess {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Mahesh");
        students.put(102, "Rahul");
        students.put(103, "Prajwal");

        for (Integer key : students.keySet()) {

            System.out.println(key + " -> " + students.get(key));
        }
    }
}