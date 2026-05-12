
import java.util.HashMap;

class MapMethods {
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<>();

        map.put(101, "Mahesh");
        map.put(102, "Pravin");
        map.put(103, "Aditya");
        map.put(104, "Ashish");

        // Display All Student 
        System.out.println(map);// {101=Mahesh, 102=Pravin, 103=Aditya, 104=Ashish}

        //Get Student 
        System.out.println(map.get(101));// Mahesh
        

        // Updating value
        map.put(101, "Boss");
        System.out.println(map);// {101=Boss, 102=Pravin, 103=Aditya, 104=Ashish}
        
        // Remove 
        map.remove(101);

        System.out.println(map);// {102=Pravin, 103=Aditya, 104=Ashish}
        System.out.println(map.containsKey(101));// false
        System.out.println(map.containsValue("Rahul")); // false

        System.out.println("Size : " + map.size());// 3
        System.out.println("Is Empty : " + map.isEmpty()); // false
    }
}