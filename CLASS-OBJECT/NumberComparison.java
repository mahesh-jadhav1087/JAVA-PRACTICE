/**
 * Problem: Find the Greater of Two Numbers
 * 
 * Logic:
 * - If num1 > num2: num1 is greater
 * - If num1 == num2: both are equal
 * - Else: num2 is greater
 * 
 * Approach:
 * - Utilize a helper class 'ComparisonEngine' to encapsulate logic
 * - Use conditional if-else-if ladder for comparison
 * - Implement Scanner for dynamic user input
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

class ComparisonEngine {

    /**
     * Method to compare two integers and print the result
     * @param num1 First integer
     * @param num2 Second integer
     */
    void compareGreater(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal.");
        } else {
            System.out.println(num2 + " is greater.");
        }
    }
}

public class NumberComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Object Creation
        ComparisonEngine engine = new ComparisonEngine();

        // Logic Execution
        engine.compareGreater(num1, num2);

        // Resource Management
        sc.close();
    }
}