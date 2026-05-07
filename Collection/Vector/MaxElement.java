/*
Q5. Write a Java program to find the maximum element in a Vector.
Description
Store integer values.
Assume first element as max.
Compare with remaining elements.
Print maximum value.
Input
Enter elements:
12
45
7
89
34
Output
Maximum element is 89

 */

import  java.util.Vector;

public class MaxElement {
    public static void main(String[] args) {
        Vector <Object> v=new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        Object max=  v.get(0);

       for(Object obj:v)
		{
			  if( (int) obj > (int) max)
			  { 
                max=obj;
			  }
		}


        System.out.println("Max Element is :"+max);
        
    }
    
}
