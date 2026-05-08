// Swap two position value 

import java.util.Collections;
import java.util.LinkedList;

public class SwapElements {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Before Swaping :"+list);
        Collections.swap(list, 1, 3);

        System.out.println("After Swaping :"+list);
    }
}