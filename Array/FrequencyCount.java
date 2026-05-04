/**
 * Problem: Count Frequency of Elements
 *
 * Approach:
 * - For each element, count occurrences
 * - Skip already counted elements
 *
 * 
 */

public class FrequencyCount {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1};

        countFrequency(arr);
    }

    public static void countFrequency(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            boolean visited = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    visited = true;
                    break;
                }
            }

            if (visited) continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }
}