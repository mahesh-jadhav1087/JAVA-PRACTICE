import java.util.HashSet;

public class CustomObjectInHashSet {

    public static void main(String[] args) {

        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Employee(101, "Mahesh"));
        employees.add(new Employee(102, "Shreyash"));
        employees.add(new Employee(101, "Mahesh")); // Duplicate

        System.out.println("Employee Records:");

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}