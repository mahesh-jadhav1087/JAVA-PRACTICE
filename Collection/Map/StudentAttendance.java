import java.util.LinkedHashMap;
import java.util.Map;

public class StudentAttendance {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> students = new LinkedHashMap<>();

        students.put(1,"Mahesh");
        students.put(2,"Rahul");
        students.put(3,"Shreyash");

        for(Map.Entry<Integer,String> s :students.entrySet())
        {
            System.out.println( s.getKey() + " -> " +s.getValue());
            // 1 -> Mahesh
            // 2 -> Rahul
            // 3 -> Shreyash
        }
    }
}