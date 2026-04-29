/**
 * Problem: Menu Driven Program (Basic Operations)
 *
 * Task:
 * - Perform different operations based on user choice
 *
 * Options:
 * 1. Check whether a character is vowel or consonant
 * 2. Find maximum of three numbers
 * 3. Check if a number is divisible by 5 and 11
 *
 * Approach:
 * - Display a menu to the user
 * - Take input for choice
 * - Use switch-case to execute the selected operation
 * - Use conditional statements for logic inside each case
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Display Menu
        System.out.println("MENU");
        System.out.println("1. Check vowel or consonant");
        System.out.println("2. Find maximum of three numbers");
        System.out.println("3. Check number divisible by 5 and 11");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        // Perform operation based on choice
        performOperation(choice, scanner);

        scanner.close();
    }

    // Method to handle menu operations
    public static void performOperation(int choice, Scanner scanner) {

        switch (choice) {

            case 1:
                System.out.print("Enter a character: ");
                char ch = scanner.next().charAt(0);

                if (isVowel(ch)) {
                    System.out.println("It is a vowel.");
                } else {
                    System.out.println("It is a consonant.");
                }
                break;

            case 2:
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();

                System.out.print("Enter second number: ");
                int b = scanner.nextInt();

                System.out.print("Enter third number: ");
                int c = scanner.nextInt();

                int max = findMax(a, b, c);
                System.out.println("Maximum number is: " + max);
                break;

            case 3:
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();

                if (isDivisibleBy5And11(num)) {
                    System.out.println("Number is divisible by 5 and 11.");
                } else {
                    System.out.println("Number is not divisible by 5 and 11.");
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    // Method to check vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    // Method to find maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c ? b : c);
    }

    // Method to check divisibility
    public static boolean isDivisibleBy5And11(int num) {
        return num % 5 == 0 && num % 11 == 0;
    }
}