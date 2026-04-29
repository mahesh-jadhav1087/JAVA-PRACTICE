/**
 * Problem: Conditional Statements Demo
 *
 * Covers:
 * 1. Even or Odd Number
 * 2. Age Check (Adult or Not)
 * 3. Find Maximum of Three Numbers
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class ConditionalStatementsDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Even or Odd
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        checkEvenOdd(num);

        // Age Check
        System.out.print("\nEnter your age: ");
        int age = scanner.nextInt();
        checkAge(age);

        // Maximum of three numbers
        System.out.print("\nEnter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        findMax(a, b, c);

        scanner.close();
    }

    // Method to check even or odd
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    // Method to check age
    public static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("You are an Adult");
        } else {
            System.out.println("You are NOT an Adult");
        }
    }

    // Method to find maximum of three numbers
    public static void findMax(int a, int b, int c) {

        if (a >= b && a >= c) {
            System.out.println("Maximum is: " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Maximum is: " + b);
        } 
        else {
            System.out.println("Maximum is: " + c);
        }
    }
}