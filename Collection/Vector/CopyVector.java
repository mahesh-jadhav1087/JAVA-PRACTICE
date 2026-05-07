/*
Q9. Write a Java program to copy all elements from one Vector into another Vector.
Description
Create two Vectors.
Store elements in first Vector.
Copy using addAll() method.
Display second Vector.
Input
Enter elements:
5
10
15
20
Output
Second Vector elements:
5
10
15
20
 */
import java.util.*;
public class CopyVector {
     public static void main(String[] MJ)
    {
        Vector <Object> v=new Vector<>();
        Vector <Object> v2=new Vector<>();

         v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        v2.addAll(v);
        
        for (Object obj : v2) {

            System.out.println(""+obj);
            
        }


    }
    
}
