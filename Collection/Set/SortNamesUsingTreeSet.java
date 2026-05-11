import java.util.TreeSet;

public class SortNamesUsingTreeSet {

    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();

        names.add("Mahesh");
        names.add("Shreyash");
        names.add("Amit");
        names.add("Prajwal");

        System.out.println("Names in Alphabetical Order:");
        System.out.println(names);
    }
}