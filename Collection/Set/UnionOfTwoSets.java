import java.util.HashSet;

public class UnionOfTwoSets {

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        HashSet<Integer> union = new HashSet<>(set1);

        union.addAll(set2);

        System.out.println("Union of Sets:");
        System.out.println(union);
    }
}