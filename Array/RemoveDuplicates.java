/**
 * Problem: Remove Duplicates from Array
 *
 * Approach:
 * - Use a temporary array
 * - Store only unique elements
 *
 * 
 */

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int[] result = removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {

        int[] temp = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < k; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[k++] = arr[i];
            }
        }

        // Create exact size array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}