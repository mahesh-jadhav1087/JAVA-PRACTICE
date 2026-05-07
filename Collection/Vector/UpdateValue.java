/*
Q7. Write a Java program to update an element at a specific position in a Vector.
Description
Store elements in Vector.
Ask user for position.
Accept new value.
Update using set(index,value) method.
Display updated Vector.
Input
Enter elements:
10
20
30
40

Enter position to update:
2

Enter new value:
99
Output
Updated Vector:
10
20
99
40
 */
import java.util.*;

public class UpdateValue {
    public static void main(String[] args)
    {
        Vector <Object> v=new Vector<>();
        Scanner sc=new Scanner(System.in);
         v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        System.out.println("Enter position to update:");
        int index=sc.nextInt();
        System.out.println("Enter new value:");
        int value=sc.nextInt();

        v.set(index, value);

        System.out.println("Updated vector  :");
        for(Object obj:v)
        {
        System.out.print("\t"+obj);
        }



        

    }
    
}
