//Search Element
//Check whether a given number exists in list or not

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        int search=40;
        if(list.contains(search))
        {
            System.err.println("Element is present in list ");
        }
        else{
            System.out.println("Element is not present in list ");
        }

    

    }
}
