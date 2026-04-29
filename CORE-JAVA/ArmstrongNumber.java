/**
 * Problem: Armstrong Number
 *
 * Definition:
 * A number is called an Armstrong Number if the sum of its digits
 * raised to the power of the number of digits is equal to the number itself.
 *
 * Example:
 * 153 → 1³ + 5³ + 3³ = 153
 *
 * Approach:
 * - Count number of digits
 * - Extract each digit
 * - Raise digit to power of total digits
 * - Sum all values and compare with original number
 *
 * Time Complexity: O(d)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check result
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is NOT an Armstrong Number");
        }

        scanner.close();
    }

    // Method to check Armstrong Number
    public static boolean isArmstrong(int num) {

        int original = num;
        int sum = 0;

        int digits = String.valueOf(num).length(); // count digits

        while (num != 0) {
            int digit = num % 10;

            sum += Math.pow(digit, digits); // power calculation

            num /= 10;
        }

        return sum == original;
    }
}