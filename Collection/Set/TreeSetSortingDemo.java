import java.util.TreeSet;

public class TreeSetSortingDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Sorted Elements:");
        System.out.println(numbers);
    }
}