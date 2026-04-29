/**
 * Problem: Convert Seconds into Hours, Minutes, and Seconds
 *
 * Approach:
 * - hours = totalSeconds / 3600
 * - remainingSeconds = totalSeconds % 3600
 * - minutes = remainingSeconds / 60
 * - seconds = remainingSeconds % 60
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter total seconds: ");
        int totalSeconds = scanner.nextInt();

        // Convert and display
        convertTime(totalSeconds);

        scanner.close();
    }

    // Method to convert time
    public static void convertTime(int totalSeconds) {

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println("\nConverted Time:");
        System.out.println("Hours   : " + hours);
        System.out.println("Minutes : " + minutes);
        System.out.println("Seconds : " + seconds);
    }
}