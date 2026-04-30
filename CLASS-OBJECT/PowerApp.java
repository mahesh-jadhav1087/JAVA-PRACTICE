/**
 * Problem: Calculate Power of a Number (Base^Exponent)
 * 
 * Formula:
 * Result = base × base × ... (exponent times)
 * 
 * Approach:
 * - Utilize an iterative approach using a 'for' loop
 * - Multiply the base by itself for the number of times specified by the exponent
 * - Encapsulate logic in a 'PowerEngine' class for better modularity
 * 
 * Time Complexity: O(n) - where n is the exponent
 * Space Complexity: O(1)
 */

import java.util.Scanner;

class PowerEngine {

    /**
     * Calculates the power of a base raised to an exponent
     * @param base The number to be multiplied
     * @param exponent The power to which the base is raised
     * @return The calculated power result
     */
    public int calculatePower(int base, int exponent) {
        int result = 1;

        // Loop runs 'exponent' times to multiply the base
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result;
    }
}

public class PowerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Base: ");
        int base = sc.nextInt();

        System.out.print("Enter Exponent: ");
        int exponent = sc.nextInt();

        // Object Initialization
        PowerEngine engine = new PowerEngine();

        // Logic Execution
        int result = engine.calculatePower(base, exponent);

        // Output
        System.out.println("\n" + base + " raised to the power of " + exponent + " is: " + result);

        // Resource Closure
        sc.close();
    }
}