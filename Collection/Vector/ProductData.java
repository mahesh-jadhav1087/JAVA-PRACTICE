/* 
Q13.Create Product class:
productId
productName
price
Store products in Vector and display products with price less than 500.
Description
Check condition:
price < 500
Input
P1 Mouse 450
P2 Keyboard 700
P3 PenDrive 350
P4 Monitor 9000
Output
Products below 500:

P1 Mouse 450
P3 PenDrive 350
 */

import java.util.*;

class Product
{
     private int productId;
    private String productName;
    private int price;

     Product(int productId , String productName, int price) {
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }

    int getproductId()
    {
        return productId;
    }

    String getproductName()
    {
        return productName;
    }

    int getprice()
    {
        return price;
    }


}
public class ProductData{
    public static void main(String[] args) {
        Vector v=new Vector();
        Product p1=new Product(1, "Mouse", 450);
        Product p2=new Product(2, "Kayboard", 700);
        Product p3=new Product(3, "PenDrive", 350);
        Product p4=new Product(4, "Monitor", 900);

        v.add(p1);
        v.add(p2);
        v.add(p3);
        v.add(p4);

        System.out.println("Products below 500:");
        for(Object obj:v)
        {
            Product p=(Product)obj;

            if(p.getprice() < 500)
            {
                System.out.println( p.getproductId()+"\t"+p.getproductName()+"\t"+p.getprice() );
            }
        }
    }

    
}

