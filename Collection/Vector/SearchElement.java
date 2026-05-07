/*
Q3. Write a Java program to search a given number in a Vector.
Description
Store integer values in Vector.
Accept a number to search.
Check using loop or contains() method.
Print found or not found.
Input
Enter number of elements:
5

Enter elements:
10
22
35
48
50

Enter number to search:
35
Output
Element found in vector
 */

import java.util.Scanner;
import java.util.Vector;

public class SearchElement {
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


        System.out.println("Enter number to search:");
        int search=sc.nextInt();
        if(v.contains(search))
        {
            System.out.println("Element Found in Vector ");
        }
        else {
            System.out.println("Element Not Found in Vetor ");
        }


    }
    
}
