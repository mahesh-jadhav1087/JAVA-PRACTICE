/* 
 Convert LinkedList to Array

Used: toArray()
 */

import java.util.LinkedList;

public class LinkedListToArray {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        Object arr[] = list.toArray();

        System.out.println("Array Elements:");

        for (Object obj : arr) {
            System.out.println(obj);
        }
    }
}