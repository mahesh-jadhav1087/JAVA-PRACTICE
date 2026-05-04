// Declare size of array and get arrays values from user and print it 

import java.util.*;

class  array1
{
    public static void main(String[] args) {
        // create scanner class object for taking input 
        Scanner sc=new Scanner(System.in);

        // declare arr fix array size 
        int[] arr=new int[5];

        System.out.println("Enter Elements in Array:---");
        //run for loop for taking values of array
        for (int i=0; i<arr.length; i++)
        {
            System.out.println("Enter " +i+" Position Element :-");
            arr[i]=sc.nextInt();

        }

        // display value of array
         for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
            

        }


    }
}