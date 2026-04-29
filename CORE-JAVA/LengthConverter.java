/**
 * Problem: Length Conversion (Centimeter to Meter and Kilometer)
 *
 * Approach:
 * - Take length in centimeters as input
 * - Convert:
 *      meters = cm / 100
 *      kilometers = cm / 100000
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class LengthConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter length in centimeters: ");
        double cm = scanner.nextDouble();

        // Convert and display
        convertLength(cm);

        scanner.close();
    }

    // Method to perform conversion
    public static void convertLength(double cm) {

        double meters = cm / 100;
        double kilometers = cm / 100000;

        System.out.println("\nConverted Values:");
        System.out.println("Meters: " + meters);
        System.out.println("Kilometers: " + kilometers);
    }
}