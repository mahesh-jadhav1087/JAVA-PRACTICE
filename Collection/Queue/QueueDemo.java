import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);

        System.out.println("Front Element: " + queue.peek());

        queue.poll();

        System.out.println("After Removing: " + queue);
    }
}