/*
Copy One LinkedList to Another

Used: addAll() 

*/

import java.util.LinkedList;

public class CopyLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        list2.addAll(list1);

        System.out.println("Copied List: " + list2);
    }
}