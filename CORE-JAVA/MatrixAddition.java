
/**
 * Problem: Matrix Addition (2D Array)
 *
 * Task:
 * - Take input for two 3x3 matrices
 * - Add both matrices
 * - Display the result matrix
 *
 * Formula:
 * - c[i][j] = a[i][j] + b[i][j]
 *
 * Approach:
 * - Take input for both matrices using nested loops
 * - Traverse both matrices and add corresponding elements
 * - Store result in third matrix
 * - Display all matrices
 *
 * Time Complexity: O(n × m)
 * Space Complexity: O(n × m)
 */

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

        // Input first matrix
        System.out.println("Enter values for first matrix:");
        inputMatrix(a, scanner);

        // Input second matrix
        System.out.println("Enter values for second matrix:");
        inputMatrix(b, scanner);

        // Add matrices
        int[][] result = addMatrices(a, b);

        // Display matrices
        System.out.println("\nFirst Matrix:");
        displayMatrix(a);

        System.out.println("\nSecond Matrix:");
        displayMatrix(b);

        System.out.println("\nResultant Matrix:");
        displayMatrix(result);

        scanner.close();
    }

    // Method to input matrix
    public static void inputMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to add matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {

        int[][] c = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;
    }

    // Method to display matrix
    public static void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
}