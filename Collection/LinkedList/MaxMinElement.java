// Find Min, Max Element  

import java.util.Collections;
import java.util.LinkedList;

public class MaxMinElement {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(50);
        list.add(10);
        list.add(90);
        list.add(30);

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }
}