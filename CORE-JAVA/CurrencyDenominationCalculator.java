/**
 * Problem: Currency Denomination Calculator
 *
 * Task:
 * - Given an amount, break it into minimum number of notes
 *
 * Denominations:
 * 500, 100, 50, 20, 10, 5, 2, 1
 *
 * Approach:
 * - Use greedy method:
 *   Always take the largest denomination first
 *
 * Time Complexity: O(n) where n = number of denominations
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class CurrencyDenominationCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        // Validate input
        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        }

        calculateNotes(amount);

        scanner.close();
    }

    // Method to calculate denominations
    public static void calculateNotes(int amount) {

        int[] notes = {500, 100, 50, 20, 10, 5, 2, 1};

        for (int note : notes) {

            int count = amount / note;

            if (count > 0) {
                System.out.println(note + " = " + count);
            }

            amount %= note;
        }




        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the amount: ");
        // int amount = sc.nextInt();

        // int n500 = amount / 500;
        // amount %= 500;

        // int n100 = amount / 100;
        // amount %= 100;

        // int n50 = amount / 50;
        // amount %= 50;

        // int n20 = amount / 20;
        // amount %= 20;

        // int n10 = amount / 10;
        // amount %= 10;

        // int n5 = amount / 5;
        // amount %= 5;

        // int n2 = amount / 2;
        // amount %= 2;

        // int n1 = amount;

        // System.out.println("500 = " + n500);
        // System.out.println("100 = " + n100);
        // System.out.println("50 = " + n50);
        // System.out.println("20 = " + n20);
        // System.out.println("10 = " + n10);
        // System.out.println("5 = " + n5);
        // System.out.println("2 = " + n2);
        // System.out.println("1 = " + n1);
    }
}