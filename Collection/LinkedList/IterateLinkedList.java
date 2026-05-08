/*
Iterate Through LinkedList

Practice:

for loop
enhanced for loop
Iterator

*/

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(100);
        list.add(200);
        list.add(300);

        System.out.println("Using for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nUsing enhanced for loop");
        for (int num : list) {
            System.out.println(num);
        }

        System.out.println("\nUsing Iterator");
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}