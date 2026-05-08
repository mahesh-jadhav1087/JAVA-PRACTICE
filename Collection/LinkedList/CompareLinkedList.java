/*Compare Two LinkedLists

Check: equal or not
 */

import java.util.LinkedList;

public class CompareLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(10);
        list1.add(20);

        list2.add(10);
        list2.add(20);

        if (list1.equals(list2)) {
            System.out.println("Both LinkedLists are equal");
        } else {
            System.out.println("Both LinkedLists are not equal");
        }
    }
}