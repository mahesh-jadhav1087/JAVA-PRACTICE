/*
Reverse a LinkedList

Use:

descendingIterator()
 */

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> itr = list.descendingIterator();

        System.out.println("Reverse Order:");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}