/**
 * Problem: Student Grade Calculation
 * 
 * Logic:
 * - Calculate total marks from three subjects.
 * - Calculate percentage and assign a Pass/Fail status.
 * 
 * Approach:
 * - Create a 'Student' class with attributes for marks.
 * - Use a method to return the result based on a 35% passing threshold.
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

class Student {
    String name;
    int m1, m2, m3;

    void setDetails(String n, int s1, int s2, int s3) {
        name = n;
        m1 = s1;
        m2 = s2;
        m3 = s3;
    }

    void calculateResult() {
        int total = m1 + m2 + m3;
        float percentage = total / 3.0f;

        System.out.println("\nStudent: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Status: " + (percentage >= 35 ? "PASSED" : "FAILED"));
    }
}

public class StudentGradingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks for 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        s.setDetails(name, m1, m2, m3);
        s.calculateResult();
        sc.close();
    }
}