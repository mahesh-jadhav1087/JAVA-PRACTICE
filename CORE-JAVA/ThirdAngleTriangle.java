/**
 * Problem: Find Third Angle of a Triangle
 *
 * Task:
 * - Given two angles of a triangle, find the third angle
 *
 * Formula:
 * - Sum of angles in a triangle = 180°
 * - Third Angle = 180 - (First Angle + Second Angle)
 *
 * Input:
 * - First angle
 * - Second angle
 *
 * Output:
 * - Third angle of the triangle
 *
 * Approach:
 * - Take two angle inputs
 * - Apply formula
 * - Validate that sum of two angles is less than 180
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class ThirdAngleTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter first angle of triangle: ");
        int firstAngle = scanner.nextInt();

        System.out.print("Enter second angle of triangle: ");
        int secondAngle = scanner.nextInt();

        // Validate input
        if (firstAngle <= 0 || secondAngle <= 0 || (firstAngle + secondAngle) >= 180) {
            System.out.println("Invalid angles for a triangle.");
        } else {
            int thirdAngle = calculateThirdAngle(firstAngle, secondAngle);
            System.out.println("Third angle = " + thirdAngle + "°");
        }

        scanner.close();
    }

    // Method to calculate third angle
    public static int calculateThirdAngle(int a, int b) {
        return 180 - (a + b);
    }
}