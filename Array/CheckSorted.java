/**
 * Problem: Check if Array is Sorted
 *
 * Approach:
 * - Compare each element with next
 *
 * 
 */

public class CheckSorted {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 8, 5};

        boolean result = isSorted(arr);

        if (result)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }

    public static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}