/*
Merge Two Lists

Input:

List1 = [1,2,3]
List2 = [4,5,6]

Output:

[1,2,3,4,5,6]
 */

import java.util.ArrayList;
import java.util.Arrays;

public class MergeLists {
    public static void main(String[] args) {
        // 1. Initialize List1 and List2
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        // 2. Create a new list to hold the merged result
        // This keeps the original lists intact
        ArrayList<Integer> mergedList = new ArrayList<>(list1);

        // 3. Use addAll() to merge List2 into the mergedList
        mergedList.addAll(list2);

        // Output the result
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("Merged List: " + mergedList);
    }
}