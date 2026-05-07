// Store and Print Names
// Store 10 student names in an ArrayList
// Print all names using:
// for loop
// enhanced for loop
// Iterator


import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {
    public static void main(String[] args) {
        // 1. Store 10 student names in an ArrayList
        ArrayList<String> students = new ArrayList<>();
        students.add("Mahesh");
        students.add("Jon");
        students.add("Mike");
        students.add("Harvy");
        students.add("Rohit");
        

        // 2. Print using a standard for loop
       
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student " + (i + 1) + ": " + students.get(i));
        }

        // 3. Print using an enhanced for loop (for-each)
      
        for (String name : students) {
            System.out.println(name);
        }

        // 4. Print using an Iterator
     
        Iterator<String> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}