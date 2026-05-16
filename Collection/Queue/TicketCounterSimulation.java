import java.util.*;

public class TicketCounterSimulation {

    public static void main(String[] args) {

        Queue<String> customers = new LinkedList<>();

        customers.offer("Mahesh");
        customers.offer("Rahul");
        customers.offer("Amit");

        while(!customers.isEmpty()){

            System.out.println(customers.poll() +" got ticket");
        }
    }
}