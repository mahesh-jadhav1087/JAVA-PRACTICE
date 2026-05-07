/* 
Q8. Write a Java program to count how many even numbers are present in a Vector.
Description
Store integer values.
Traverse using loop.
Check number % 2 == 0.
Count even numbers.
Input
Enter elements:
10
15
20
25
30
Output
Total even numbers = 3
 */

import java.util.*;
public class CountEvenNo {
    public static void main(String[] MJ)
    {
        Vector <Object> v=new Vector<>();

         v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

         int count=0;
        for (Object obj : v) {
           
            if((int) obj %2 ==0)
            {
                count++;
                
            }
            
        }
        System.out.println("Total even numbers = "+count );
        System.out.println("Vector id emty: "+ v.isEmpty());

    }
    
}
