/*
Hashtable is an older class.
It is synchronized, meaning thread-safe.
 */

import java.util.Hashtable;

public class HashtableDemo {

    public static void main(String[] args) {

        Hashtable<Integer,String> map = new Hashtable<>();

        map.put(1,"Java");
        map.put(2,"Python");

        System.out.println(map);// {2=Python, 1=Java}
    }
}