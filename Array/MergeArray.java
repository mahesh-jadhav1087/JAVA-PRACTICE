/**
 * Problem: Merge Two Sorted Arrays
 *
 * Example:
 * arr1 = {1, 3, 5}
 * arr2 = {2, 4, 6}
 * Output = {1, 2, 3, 4, 5, 6}
 *
 * Approach:
 * - Use two pointers (i for arr1, j for arr2)
 * - Compare elements and insert smaller into result array
 * - If one array finishes, copy remaining elements
 *
 * 
 */

public class MergeArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] result = merge(arr1, arr2);

        System.out.println("Merged Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Compare elements and merge
        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < n1) {
            result[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < n2) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}