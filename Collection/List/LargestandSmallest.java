// Find Largest Number
// Store integers in ArrayList
// Find largest and smallest number manually


import java.util.ArrayList;

public class LargestandSmallest {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(5);
        list.add(50);

        int max=list.get(0);

        for (int i=0; i<list.size();i++) {
            if(max <(list.get(i)))
            {
                max=list.get(i);

            }
        }
        System.out.println("Largest :- "+ max);

         int min=list.get(0);

        for (int i=0; i<list.size();i++) {
            if(max >(list.get(i)))
            {
                max=list.get(i);

            }
        }

         System.out.println("Smallest :- "+ max);

        
    }
    
}
