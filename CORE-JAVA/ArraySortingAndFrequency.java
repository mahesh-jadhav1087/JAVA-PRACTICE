/**
 * Problem: Sort an Array and Count Frequency of Elements
 *
 * Approach:
 * - Take array input from user
 * - Sort array using Arrays.sort()
 * - Traverse sorted array and count frequency of each element
 * - Use visited[] array to avoid duplicate counting
 *
 * Time Complexity: O(n log n) for sorting + O(n²) for frequency
 * Space Complexity: O(n)
 */

import java.util.*;

public class ArraySortingAndFrequency {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Display before sorting
        System.out.println("\nArray before sorting:");
        System.out.println(Arrays.toString(arr));

        // Sort array
        Arrays.sort(arr);

        // Display after sorting
        System.out.println("\nArray after sorting:");
        System.out.println(Arrays.toString(arr));

        // Count frequency
        System.out.println("\nElement Frequency:");
        countFrequency(arr);

        scanner.close();
    }

    // Method to count frequency of elements
    public static void countFrequency(int[] arr) {

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + " → " + count);
        }
    }
}