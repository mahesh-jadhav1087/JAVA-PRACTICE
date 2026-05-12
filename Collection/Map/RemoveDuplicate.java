// Remove Duplicate Elements

// Input:

// [10, 20, 10, 30, 20, 40]

// Output:

// [10, 20, 30, 40]

import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};

        // Use LinkedHashSet to remove duplicates while keeping the original order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        // Print the result
        System.out.println(set);
    }
}
