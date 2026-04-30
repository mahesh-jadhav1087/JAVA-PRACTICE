/**
 * Problem: Check if a Given Integer is a Prime Number
 * 
 * Definition:
 * A prime number is a natural number greater than 1 that has no 
 * positive divisors other than 1 and itself.
 * 
 * Approach:
 * - Utilize a boolean 'flag' to track divisibility status.
 * - Iterate from 2 up to (num - 1) to check for potential factors.
 * - If any number divides 'num' evenly, the flag is set to false and the loop breaks.
 * - Ensure edge cases (like numbers <= 1) are handled correctly.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

class PrimeEngine {

    /**
     * Determines if a number is prime and prints the result
     * @param num The integer to be checked
     */
    public void checkPrime(int num) {
        boolean isPrime = true;

        // Logic: Check divisibility starting from 2
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break; // Exit loop early if a divisor is found
            }
        }

        // Final verification including prime definition (num > 1)
        if (isPrime && num > 1) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

public class PrimeCheckApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            // Object Initialization
            PrimeEngine engine = new PrimeEngine();

            // Execution
            engine.checkPrime(num);
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        // Resource Closure
        sc.close();
    }
}