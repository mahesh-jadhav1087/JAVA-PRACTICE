/*
Q20.Create Laptop class:
id
brand
price
Store laptops in Vector and display laptops of brand Dell.
Description
Logical condition:
brand.equals("Dell")
Input
1 Dell 55000
2 HP 60000
3 Dell 72000
4 Lenovo 50000
Output
Dell Laptops:

1 Dell 55000
3 Dell 72000
 */

import java.util.Vector;

class Laptop {
    private int id;
    private String brand;
    private double price;

    // Constructor
    Laptop(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setPrice(double price) { this.price = price; }

    // Getters
    public int getId() { return id; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }
}

class LaptopStock {
    public static void main(String[] args) {
        Vector<Laptop> laptopList = new Vector<>();

        // Adding Input Data
        laptopList.add(new Laptop(1, "Dell", 55000));
        laptopList.add(new Laptop(2, "HP", 60000));
        laptopList.add(new Laptop(3, "Dell", 72000));
        laptopList.add(new Laptop(4, "Lenovo", 50000));

        System.out.println("Dell Laptops:\n");

        // Logic: Filter by brand name
        for (Laptop lp : laptopList) {
            if (lp.getBrand().equals("Dell")) {
                System.out.println(lp.getId() + " " + lp.getBrand() + " " + (int)lp.getPrice());
            }
        }
    }
}