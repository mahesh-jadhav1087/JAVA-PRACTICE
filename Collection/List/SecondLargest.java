// Find Second Largest Element

// Without sorting directly.

import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 35, 35, 15, 7));


        // Initialize with the smallest possible integer value
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            // Case 1: Current number is greater than the largest
            if (num > largest) {
                secondLargest = largest; // Old largest becomes second largest
                largest = num;           // Update largest
            } 
            // Case 2: Current number is between largest and secondLargest
            else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest (all numbers might be the same).");
        } else {
            System.out.println("Largest: " + largest);
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}