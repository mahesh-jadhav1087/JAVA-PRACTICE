import java.util.*;

public class HotPotatoGame {

    public static void main(String[] args) {

        Queue<String> players =new LinkedList<>();

        players.offer("A");
        players.offer("B");
        players.offer("C");
        players.offer("D");
        players.offer("E");

        int count=3;

        while(players.size()>1){

            for(int i=1;i<count;i++){

                players.offer( players.poll());

            }

            System.out.println(players.poll() +" eliminated");
        }

        System.out.println( "Winner: " +players.peek());
    }
}