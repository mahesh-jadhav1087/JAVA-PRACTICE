/*  Q1.Write a Java program to store 5 integer elements in a Vector and display all elements.
Description
Create a Vector of Integer type.
Accept 5 numbers from user.
Store them using add() method.
Display elements using loop.
Input
Enter 5 numbers:
10
20
30
40
50
Output
Vector elements are:
10
20
30
40
50
 */



import java.util.*;

public class VectorDisplay
{
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
        System.out.println("Vector Elements Are ");
        for (Object obj:v)
        {
            System.out.println( obj);
        }


    }
}