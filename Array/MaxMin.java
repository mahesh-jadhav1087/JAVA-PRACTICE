/**
 * Problem: Find Maximum and Minimum Element
 *
 * Approach:
 * - Initialize max and min with first element
 * - Traverse and update values
 *
 * 
 */

public class MaxMin {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 6};

        findMaxMin(arr);
    }

    public static void findMaxMin(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}