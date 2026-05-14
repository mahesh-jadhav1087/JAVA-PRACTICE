import java.util.Map;
import java.util.TreeMap;

public class StudentMarks {

    public static void main(String[] args) {

        TreeMap<Integer,Integer> marks = new TreeMap<>();

        marks.put(103,80);
        marks.put(101,95);
        marks.put(102,70);

        for(Map.Entry<Integer,Integer> entry :marks.entrySet()) {

            System.out.println(entry.getKey()+" -> " +entry.getValue());
            //101 -> 95
            //102 -> 70
            //103 -> 80
        }
    }
}