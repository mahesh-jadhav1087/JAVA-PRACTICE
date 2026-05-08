/*  
Remove Duplicate Elements

Example:

Input : [10, 20, 10, 30, 20]
Output: [10, 20, 30]
*/

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        System.out.println("After Removing Duplicates:");
        System.out.println(set);
    }
}