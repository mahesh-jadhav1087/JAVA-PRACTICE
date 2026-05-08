
import java.util.LinkedList;

/*
Create a LinkedList
Add integer elements
Print the list

Concepts:

LinkedList<Integer>
add()
 */
public class BasicLinkedList {

    public static void main(String[] args) {
        
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);

        System.out.println("List is : - "+ list);
    }
    
}
