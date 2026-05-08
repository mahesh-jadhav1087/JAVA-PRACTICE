/*

Sort a LinkedList

Used:  Collections.sort()

*/

import java.util.Collections;
import java.util.LinkedList;

public class SortLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(50);
        list.add(10);
        list.add(30);
        list.add(20);

        Collections.sort(list);

        System.out.println("Sorted List: " + list);
    }
}