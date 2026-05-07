/*
Q6. Write a Java program to store integer elements in a Vector and display the first and last element.
Description
Create a Vector.
Store elements using add() method.
Use firstElement() and lastElement() methods.
Print both values.
Input
Enter number of elements:
5

Enter elements:
11
22
33
44
55
Output
First element = 11
Last element = 55
 */

import java.util.Vector;

public class FristandLastElement {
    public static void main(String[] args) {
       
         Vector <Object> v=new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

       System.out.println("First Element : "+ v.firstElement());
       System.out.println("Last Element : "+ v.lastElement());


    }
    
}
