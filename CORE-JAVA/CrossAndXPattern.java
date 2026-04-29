// /**
//  * Problem: Cross and X Pattern
//  *
//  * Output (n = 9):
//         
// *       *       * 
//   *     *     *   
//     *   *   *     
//       * * *       
// * * * * * * * * * 
//       * * *       
//     *   *   *     
//   *     *     *   
// *       *       *
//  *
//  * Approach:
//  * - Use a square matrix (n x n)
//  * - Print '*' when:
//  *      i == middle row
//  *      j == middle column
//  *      i == j (main diagonal)
//  *      i + j == n + 1 (secondary diagonal)
//  *
//  * Time Complexity: O(n²)
//  * Space Complexity: O(1)
//  */

public class CrossAndXPattern {

    public static void main(String[] args) {

        int n = 9;
        int mid = (n / 2) + 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == mid || j == mid || i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}