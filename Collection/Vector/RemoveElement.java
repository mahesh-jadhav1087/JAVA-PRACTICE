/*
Q4. Write a Java program to remove a specific element from a Vector.
Description
Store elements in Vector.
Take element to remove.
Use remove() method.
Display updated Vector.
Input
Enter elements:
10
20
30
40

Enter element to remove:
30
Output
Updated Vector:
10
20
40

*/

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class RemoveElement {
    public static void main (String[] args)
    {
        Vector<Object> v=new Vector<>();
        Scanner sc=new Scanner(System.in );

        System.out.println("Enter 5 Numbers :");
        for(int i=1; i<=5; i++)
        {
            int num=sc.nextInt();
            v.add(num);
        }

        System.out.println("Before  Removing Element ");
        for(Object obj : v)
        {
            System.out.println(obj);
        }


        System.out.println("Enter number to Remove from vector :");
        int remove=sc.nextInt();
    
        Iterator i=v.iterator();
        while(i.hasNext())
        {
            Object obj=i.next();
            if((int) obj == remove)
            {
                 i.remove();

            }
        }
        
        System.out.println("After Removing Element ");
        for(Object obj : v)
        {
            System.out.println(obj);
        }
    }
    
}
