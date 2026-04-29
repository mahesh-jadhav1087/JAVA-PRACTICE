/**
 * Problem: Check Spy Number
 *
 * Definition:
 * A number is called a Spy Number if the sum of its digits 
 * is equal to the product of its digits.
 *
 * Example:
 * Input: 1124
 * Sum = 1 + 1 + 2 + 4 = 8
 * Product = 1 × 1 × 2 × 4 = 8 → Spy Number
 *
 * Approach:
 * - Extract digits using modulus (% 10)
 * - Keep track of sum and product
 * - Compare both values
 *
 * Time Complexity: O(d) where d = number of digits
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class SpyNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check and print result
        if (isSpyNumber(number)) {
            System.out.println("Number is a Spy Number");
        } else {
            System.out.println("Number is NOT a Spy Number");
        }

        scanner.close();
    }

    // Method to check Spy Number
    public static boolean isSpyNumber(int num) {

        int sum = 0;
        int product = 1;

        // Process each digit
        while (num > 0) {
            int digit = num % 10;

            sum += digit;        // add digit to sum
            product *= digit;    // multiply digit to product

            num /= 10;           // remove last digit
        }

        return sum == product;
    }
}