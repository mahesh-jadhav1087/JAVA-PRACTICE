// Reverse ArrayList

// Without using:

// Collections.reverse()


import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

    // Reverse list with in build method 

    //    Collections.reverse(list);
    //    System.out.println(list);


    // Revers Without in Build method 

    for(int i=list.size()-1; i>=0 ; i--)
    {
        System.out.println(list.get(i));
    }


        
    }
}
