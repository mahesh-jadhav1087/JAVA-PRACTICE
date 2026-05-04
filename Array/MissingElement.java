// java program to find missing elements in an array.

import java.util.Arrays;

// class MissingElement {
//     public static void main(String[] args) {

//         int[] arr = {17,11,9,5,2};

//         Arrays.sort(arr);

//         System.out.print("Missing elements = ");

//         for (int i = 1; i < arr.length; i++) {
//             for (int j = arr[i - 1] + 1; j < arr[i]; j++) {
//                 System.out.print(j + " ");
//             }
//         }
//     }
// }

public class MissingElement 
{
    public static void main(String[] args) {
        
        int[] arr={7,5,3,1};
        Arrays.sort(arr);


        for(int i=1; i<arr.length; i++)
        {
            int diff=arr[i]-arr[i-1];
            if (diff>1)
            {
                int temp=arr[i-1];
                while(temp<(arr[i]-1))
                {
                    System.out.println(++temp);
                }
            }
        }
    }
}