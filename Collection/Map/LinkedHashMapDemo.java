/*
LinkedHashMap maintains insertion order.
Unlike HashMap, elements appear in the same order they were inserted.
*/

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> map =
                new LinkedHashMap<>();

        map.put(103,"Prajwal");
        map.put(101,"Mahesh");
        map.put(102,"Rahul");

        System.out.println(map);//{103=Prajwal, 101=Mahesh, 102=Rahul}
    }
}