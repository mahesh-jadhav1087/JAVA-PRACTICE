/**
 * Problem: Triangle Type Checker
 *
 * Task:
 * - Determine whether a triangle is:
 *      Equilateral → all sides equal
 *      Isosceles   → two sides equal
 *      Scalene     → all sides different
 *
 * Additional Check:
 * - Validate if sides form a triangle using:
 *      a + b > c, b + c > a, a + c > b
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class TriangleTypeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter first side: ");
        int a = scanner.nextInt();

        System.out.print("Enter second side: ");
        int b = scanner.nextInt();

        System.out.print("Enter third side: ");
        int c = scanner.nextInt();

        // Check and display result
        checkTriangle(a, b, c);

        scanner.close();
    }

    // Method to check triangle type
    public static void checkTriangle(int a, int b, int c) {

        // Validate triangle
        if (a + b <= c || b + c <= a || a + c <= b) {
            System.out.println("Invalid triangle");
            return;
        }

        // Classification
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } 
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } 
        else {
            System.out.println("Scalene Triangle");
        }
    }
}