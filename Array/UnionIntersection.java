/**
 * Problem: Union and Intersection of Two Arrays
 *
 * Approach:
 * - Union: Combine elements, avoid duplicates manually
 * - Intersection: Find common elements
 *
 * 
 */

public class UnionIntersection {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        union(arr1, arr2);
        intersection(arr1, arr2);
    }

    public static void union(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        int k = 0;

        // Add all elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            result[k++] = arr1[i];
        }

        // Add only unique elements from arr2
        for (int i = 0; i < arr2.length; i++) {

            boolean exists = false;

            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                result[k++] = arr2[i];
            }
        }

        System.out.println("Union:");
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    public static void intersection(int[] arr1, int[] arr2) {

        System.out.println("Intersection:");

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}