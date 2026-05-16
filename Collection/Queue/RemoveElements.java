import java.util.*;

public class RemoveElements {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Before: " + queue);

        queue.remove();

        System.out.println("After: " + queue);
    }
}