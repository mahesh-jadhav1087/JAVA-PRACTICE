import java.util.HashSet;

public class CountDistinctElements {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 4, 4, 5, 6, 6};

        HashSet<Integer> distinct = new HashSet<>();

        for (int num : numbers) {
            distinct.add(num);
        }

        System.out.println("Distinct Elements:");
        System.out.println(distinct);

        System.out.println("Count of Distinct Elements: " + distinct.size());
    }
}