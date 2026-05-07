/* 
Q16.Create Customer class:
id
name
age
Store customers in Vector and display customers eligible for voting (age ≥18).
Description
Logical condition:
age >= 18
Input
1 Ravi 17
2 Meena 22
3 Arjun 19
4 Tina 15
Output
Eligible customers:

2 Meena 22
3 Arjun 19
 */

import java.util.*;

class Customer
{
    private  int id;
    private String Name;
    private  int age;

    public Customer(int id, String Name, int age) {
        this.id = id;
        this.Name = Name;
        this.age = age;
    }
    
    int getId()
    {
        return id;

    }
    String getName()

    {
        return  Name;
    }

    int getage()
    {
        return age;
    }


}


public class VoterSystem {
    public static void main(String[] args) {
        Customer c1=new Customer(1, "Ravi", 17);
        Customer c2=new Customer(2, "Meena", 22);
        Customer c3=new Customer(3, "Arjun", 19);
        Customer c4=new Customer(4, "Tina", 15);

        Vector v=new Vector<>();
        v.add(c1);
        v.add(c2);
        v.add(c3);
        v.add(c4);

        System.out.println("Eligible customers: ");

        for (Object obj : v) {

            Customer c=(Customer)obj;
            if(c.getage() >+18)
            {
                System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getage());
            }
            
        }

        
    }
    
}
