//  program in java to delete an element at desired position from an array.

import java.util.Scanner;

class DeleteElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Size of Array:-");
        int Arraylenght=sc.nextInt();
        int[] arr=new int[Arraylenght];

        System.out.println("Enter Elements in Array:-");

       for(int i=0; i<Arraylenght ; i++)
       {
            arr[i]=sc.nextInt();
       }

       System.out.print("Array= ");
       for (int  num : arr) {
         System.out.print(num+" ");
           
       }

       System.out.println("\nEnter Position of Element you wnat to delete :- ");
       int deletposition=sc.nextInt();

       int[] arr2=new int[arr.length-1];

       for(int i=0, j=0; i<arr.length; i++)
       {
        if (i !=deletposition-1)
        {
            arr2[j++]=arr[i];
        }
       }

       System.out.print("\nArray After Deletion =");
       for (int  num : arr2) {
         System.out.print(num+" ");
           
       }

    }
}