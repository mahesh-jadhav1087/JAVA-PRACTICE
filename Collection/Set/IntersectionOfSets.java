import java.util.HashSet;

public class IntersectionOfSets {

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        HashSet<Integer> intersection = new HashSet<>(set1);

        intersection.retainAll(set2);

        System.out.println("Intersection of Sets:");
        System.out.println(intersection);
    }
}