/**
 * Problem: Move Zeros to End
 *
 * Approach:
 * - Create new array
 * - Copy non-zero elements first
 * - Remaining positions stay zero
 *
 * 
 */

public class MoveZeros {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int[] result = moveZeros(arr);

        System.out.println("After moving zeros:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] moveZeros(int[] arr) {

        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }

        return result;
    }
}