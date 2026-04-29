/**
 * Problem: Ternary Operator Examples
 *
 * Task:
 * - Use ternary operator for different conditions:
 *   1. Find maximum of three numbers
 *   2. Check if a person is adult
 *   3. Check if a number is even or odd
 *
 * Approach:
 * - Use nested ternary operator for maximum
 * - Use simple ternary for age check
 * - Use bitwise operator (&) to check even/odd
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class TernaryOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Maximum of three numbers
        int a = 20, b = 30, c = 10;
        int max = findMax(a, b, c);
        System.out.println("Maximum number = " + max);

        // 2. Age check
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        String status = checkAdult(age);
        System.out.println(status);

        // 3. Even or Odd
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String result = checkEvenOdd(num);
        System.out.println(num + " is " + result);

        scanner.close();
    }

    // Method to find maximum using ternary
    public static int findMax(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

    // Method to check adult
    public static String checkAdult(int age) {
        return (age >= 18) ? "You are an Adult" : "You are not an Adult";
    }

    // Method to check even or odd
    public static String checkEvenOdd(int num) {
        return ((num & 1) == 0) ? "Even" : "Odd";
    }
}