
import java.util.LinkedList;


/*
Search an Element

Practice:

contains()
indexOf()
 */


public class SearchElements {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("Contains Mango: " + list.contains("Mango"));  //true
        System.out.println("Index of Banana: " + list.indexOf("Banana")); //1


    }
    
}
