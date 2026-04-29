/**
 * Problem: Area, Diameter and Circumference of a Circle
 *
 * Approach:
 * - Take radius as input from user
 * - Calculate:
 *      Diameter = 2 × radius
 *      Circumference = 2 × π × radius
 *      Area = π × radius²
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input: radius of circle
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        // Calculations
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Output results
        System.out.println("\nResults:");
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

        scanner.close();
    }
}