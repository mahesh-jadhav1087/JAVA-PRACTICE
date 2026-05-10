import java.util.HashSet;

public class CheckElementExists {

    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        String search = "Mango";

        if (fruits.contains(search)) {
            System.out.println(search + " exists in set.");
        } else {
            System.out.println(search + " does not exist.");
        }
    }
}