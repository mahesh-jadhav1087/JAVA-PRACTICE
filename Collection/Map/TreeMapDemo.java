/*
TreeMap stores keys in sorted order.

By default:
Ascending order
Natural sorting
 */

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> map =new TreeMap<>();

        map.put(103,"Prajwal");
        map.put(101,"Mahesh");
        map.put(102,"Rahul");

        System.out.println(map);// {101=Mahesh, 102=Rahul, 103=Prajwal}
    }
}