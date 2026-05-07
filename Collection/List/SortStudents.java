/*
Sort Student Names
Ascending
Descending

Use:

Collections.sort()
 */

import java.util.ArrayList;
import java.util.Collections;

public class SortStudents {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Mahesh");
        students.add("pravin");
        students.add("John");
        students.add("Rahul");
        students.add("Priya");

        System.out.println("Original List: " + students);

        // 1. Sort in Ascending Order (A to Z)
        Collections.sort(students);
        System.out.println("Ascending Order:  " + students);

        // 2. Sort in Descending Order (Z to A)
        Collections.sort(students, Collections.reverseOrder());
        System.out.println("Descending Order: " + students);
    }
}