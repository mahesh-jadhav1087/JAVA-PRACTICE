/**
 * Problem: Generate Employee Salary Slip
 * 
 * Formula:
 * - HRA = 10% of Basic Salary
 * - PF = 12% of Basic Salary
 * - Net Salary = (Basic + HRA) - PF
 * 
 * Approach:
 * - Use a constructor to initialize the Employee object.
 * - Perform salary components calculation in a dedicated method.
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void printSalarySlip() {
        double hra = basicSalary * 0.10;
        double pf = basicSalary * 0.12;
        double netSalary = (basicSalary + hra) - pf;

        System.out.println("\n--- Salary Slip for " + name + " ---");
        System.out.println("Employee ID : " + id);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (10%)   : " + hra);
        System.out.println("PF (12%)    : " + pf);
        System.out.println("Net Salary  : " + netSalary);
    }
}

public class EmployeeSalaryApp {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "MJ", 50000);
        emp.printSalarySlip();
    }
}