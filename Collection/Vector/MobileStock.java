/*

Q17.Create Mobile class:
id
brand
quantity
Store mobiles in Vector and display mobiles with stock less than 10.
Description
Condition:
quantity < 10
Input
1 Samsung 15
2 Vivo 8
3 Oppo 5
4 Apple 20
Output
Low Stock Mobiles:

2 Vivo 8
3 Oppo 5
 */

import java.util.*;

class Mobile 
{
    private int id;
    private String brand;
    private int quantity;

    public Mobile(int id, String brand, int quantity) {
        this.id = id;
        this.brand = brand;
        this.quantity = quantity;
    }

    int getId()
    {
        return id;
    }

    String getbrand()
    {
        return brand;
    }

    int getquntity()
    {
        return quantity;
    }

}



public class MobileStock {
    public static void main(String[] args) {
        
        Mobile m1 = new Mobile(1, "Samsung", 15);
        Mobile m2 = new Mobile(2, "Vivo", 8);
        Mobile m3 = new Mobile(3, "Oppo", 5);
        Mobile m4 = new Mobile(4, "Apple", 20);

        Vector v=new Vector<>();

        v.add(m1);
        v.add(m2);
        v.add(m3);
        v.add(m4);
        
        System.out.println("Low Stock Mobiles:  \n");

        for (Object obj : v) {

            Mobile m=(Mobile)obj;
            if(m.getquntity() <10)
            {
               System.out.println(m.getId()+"\t"+m.getbrand()+"\t"+m.getquntity());
            }
            
        }
    }
    
}
