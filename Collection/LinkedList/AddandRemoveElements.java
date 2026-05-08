/*
Add Elements at Different Positions

Practice:

addFirst()
addLast()
add(index, value)


Remove Elements

Practice:

remove()
removeFirst()
removeLast()
remove(index)
 */
import java.util.LinkedList;

public class AddandRemoveElements {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);

        System.out.println("LinkedList: "+list);
        list.addFirst(9);
        System.out.println("addFirst(): "+list);
        list.addLast(100);
        System.out.println("addLast(): "+list);
        
        list.add(3, 30);
        System.out.println("add(index, value): "+list);


        System.out.println("-----------------------------");
        list.remove();
        System.out.println("remove(): "+list);

        list.removeFirst();
        System.out.println("removeFirst(): "+list);

         list.removeLast();
        System.out.println("removeLast(): "+list);

         list.remove(2);
        System.out.println("removeFirst(Index): "+list);




    }
    
}
