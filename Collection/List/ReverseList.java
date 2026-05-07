// Reverse ArrayList

// Without using:

// Collections.reverse()

import java.util.ArrayList;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Collections.reverse(list);

        System.out.println("Original: " + list);

        // Manual Reversal Logic
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int  temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            // Move pointers towards the middle
            left++;
            right--;
        }

        System.out.println("Reversed: " + list);
    }
}