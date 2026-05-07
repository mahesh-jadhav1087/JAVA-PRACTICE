/*
Q12.Create an Employee POJO class with:
id
name
salary
Store employees in Vector and display employees having salary greater than 25000.
Description
Logical operation:
if(salary > 25000)
Input
1 Raj 20000
2 Simran 30000
3 Ajay 27000
4 Ramesh 18000
Output
Employees with salary above 25000:

2 Simran 30000
3 Ajay 27000
 */

import java.util.*;

class Employee
{
    private int id;
    private String name;
    private int salary;

    public Employee(int id , String name, int salry) {
        this.id=id;
        this.name=name;
        this.salary=salry;
    }

    int getId()
    {
        return id;
    }

    String getName()
    {
        return name;
    }

    int getSalary()
    {
        return salary;
    }


    
}
public class EmployeeData {
    public static void main(String[] args) {
        Vector v=new Vector();
        Employee em1=new Employee(1, "Raj", 20000);
        Employee em2=new Employee(2, "Simran", 30000);
        Employee em3=new Employee(3, "Ajay", 27000);
        Employee em4=new Employee(4, "Ramesh", 18000);

        v.add(em1);
        v.add(em2);
        v.add(em3);
        v.add(em4);

        System.out.println("Employees with salary above 25000:");
        for(Object obj:v)
        {
            Employee em=(Employee)obj;

            if(em.getSalary() > 25000)
            {
                System.out.println( em.getId()+"\t"+em.getName()+"\t"+em.getSalary() );
            }
        }
    }

    
}
