//  java program to give an array, find the second largest element.
// Input : Array = {12, 35, 1, 10, 34, 1}
// Output : Second largest = 34


public class SecondLarge {
    public static void main(String[] args) {
        
        int[] arr={12, 35, 1, 10, 34, 1};
        int large=0;
        int secondLargest=0;

        for (int i = 0; i < arr.length; i++) {
            
            if (large < arr[i])
            {
                large=arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != large) {

                secondLargest = arr[i];
            }
        }
        System.out.println("Large Element ="+secondLargest);
    }
    
}
