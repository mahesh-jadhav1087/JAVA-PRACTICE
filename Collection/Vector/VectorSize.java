/*
Q2. Write a Java program to store N elements in a Vector and print the total number of elements.
Description
Create Vector.
Take number of elements from user.
Store values.
Use size() method to find total elements.
Input
Enter number of elements:
4

Enter elements:
5
15
25
35
Output
Total elements in vector = 4
 */

import java.util.Vector;

public class VectorSize {

    public static void main(String[] args)
    {
       Vector <Integer> v = new Vector<>();

        v.add(39);
        v.add(10);
        v.add(39);
        v.add(10);
        v.add(39);
        v.add(10);
        v.add(39);
        v.add(10);


        System.out.println("Total Element in vector : "+v.size());


    }
    
}
