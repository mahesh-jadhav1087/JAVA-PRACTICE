
// Store and Print Names
// Store 5 student names in an ArrayList
// Print all names using:
// for loop
// enhanced for loop
// Iterator


import java.util.ArrayList;
import java.util.Iterator;

class StudentData{
    public static void main(String[] args) {
       
        
        ArrayList<String> list=new ArrayList<>();
        list.add("Mahesh");
        list.add("Jon");
        list.add("Harvy");
        list.add("Mike");
        list.add("Pravin");
        

        // print data using for loop 

        // System.out.println("Student name :-");
        // for (int i=0; i<list.size(); i++)
        // {
        //     System.out.println(list.get(i));
        // }



        //Print data using enhanced for loop

        // System.out.println("Student name :-");
        // for (String name:list)
        // {
        //     System.out.println(name);
        // }

        // . print data using Iterator 
        Iterator<String> it = list.iterator();

        // 3. Loop through and print
        while (it.hasNext()) { // Checks if there is a next element
            System.out.println(it.next()); // Retrieves the element and moves the cursor
        }
    }


}