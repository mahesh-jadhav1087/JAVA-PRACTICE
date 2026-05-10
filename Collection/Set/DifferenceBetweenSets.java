import java.util.HashSet;

public class DifferenceBetweenSets {

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        HashSet<Integer> difference = new HashSet<>(set1);

        difference.removeAll(set2);

        System.out.println("Difference of Sets:");
        System.out.println(difference);
    }
}