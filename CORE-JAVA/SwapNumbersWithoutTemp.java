/**
 * Problem: Swap Two Numbers Without Using a Temporary Variable
 *
 * Approach:
 * - Use arithmetic operations:
 *      a = a + b
 *      b = a - b
 *      a = a - b
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class SwapNumbersWithoutTemp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Swap
        int[] result = swap(a, b);

        // Output
        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + result[0]);
        System.out.println("Second number: " + result[1]);

        scanner.close();
    }

    // Method to swap numbers
    public static int[] swap(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        return new int[]{a, b};
    }
}