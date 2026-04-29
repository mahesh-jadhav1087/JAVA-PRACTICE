/**
 * Problem: Grade Evaluation
 *
 * Approach:
 * - Take marks as input
 * - Use conditional statements to assign grades:
 *      90–100 → A+
 *      80–89  → A
 *      70–79  → B
 *      60–69  → C
 *      <60    → Fail
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class GradeEvaluation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        // Validate input
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter between 0 and 100.");
        } else {
            evaluateGrade(marks);
        }

        scanner.close();
    }

    // Method to evaluate grade
    public static void evaluateGrade(int marks) {

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } 
        else if (marks >= 80) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 70) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 60) {
            System.out.println("Grade: C");
        } 
        else {
            System.out.println("Result: Fail");
        }
    }
}