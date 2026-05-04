/**
 * Problem: Find Duplicate Elements in an Array
 *
 * Approach:
 * - Traverse each element
 * - Check if it appeared before (avoid repeated printing)
 * - Then check if it appears again later → duplicate
 *
 * 
 */

public class FindDuplicate {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1};

        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {

        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyChecked = false;

            // Check if element already processed
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) continue;

            // Check duplicate
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}