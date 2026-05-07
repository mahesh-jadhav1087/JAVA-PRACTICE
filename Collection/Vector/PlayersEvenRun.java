/*
Q14.Create Player class:
playerId
playerName
runs
Store players in Vector and display players who scored even runs.
Description
Logical condition:
runs % 2 == 0
Input
1 Virat 75
2 Rohit 80
3 Gill 66
4 KL 59
Output
Players with even runs:

2 Rohit 80
3 Gill 66
 */

import java.util.*;

class player
{
    private int playerId;
    private String  playerName;
    int runs;

    public player(int playerId,String playerName, int runs ) {

        this.playerId=playerId;
        this.playerName=playerName;
        this.runs=runs;
    }

    int getId()
    {
        return playerId;
    }
    String getName()
    {
        return playerName;
    }
    int getRuns()
    {
        return runs;
    }

    
}
public class Vector14 {
    public static void main(String[] args) {
        
        player p1=new player(1, "Virat", 75);
        player p2=new player(1, "Rohit",80);
        player p3=new player(3,"Gill",66);
        player p4=new player(4, "KL",59);

        Vector v=new Vector<>();
        v.add(p1);
        v.add(p2);
        v.add(p3);
        v.add(p4);
        System.out.println("Players with even runs: ");
        for (Object obj : v) {

            player p=(player)obj;
            if(p.getRuns() %2==0)
            {
                System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRuns());
            }
            
        }



    }
    
}
