/**
 * Problem: 2D Array (Matrix) Input and Row Sum
 *
 * Task:
 * - Take input for a 3x3 matrix
 * - Display the matrix
 * - Calculate and print sum of each row
 *
 * Approach:
 * - Use nested loops to take input
 * - Use nested loops to display elements
 * - Maintain a sum variable for each row
 *
 * Time Complexity: O(n × m)
 * Space Complexity: O(n × m)
 */

import java.util.Scanner;

public class MatrixRowSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        // Input
        System.out.println("Enter values in the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display matrix with row sum
        displayMatrixWithRowSum(matrix);

        scanner.close();
    }

    // Method to display matrix and calculate row sum
    public static void displayMatrixWithRowSum(int[][] matrix) {

        System.out.println("Matrix with row sums:");

        for (int i = 0; i < matrix.length; i++) {

            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d\t", matrix[i][j]);
                sum += matrix[i][j];
            }

            System.out.println("= " + sum);
        }
    }
}