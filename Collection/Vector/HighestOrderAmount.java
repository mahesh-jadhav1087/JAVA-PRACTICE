/*
Q19.Create Order class:
orderId
customerName
amount
Store orders in Vector and find highest order amount.
Description
Logic:
if(amount > max)
max = amount;
Input
1 Ram 2500
2 Sita 4200
3 Mohan 3100
Output
Highest Order Amount = 4200
 */
import java.util.Vector;

class Order {
    private int orderId;
    private String customerName;
    private double amount;

    // Constructor
    Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    // Setters
    public void setOrderId(int orderId) { this.orderId = orderId; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setAmount(double amount) { this.amount = amount; }

    // Getters
    public int getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public double getAmount() { return amount; }
}

class HighestOrderAmount {
    public static void main(String[] args) {
        Vector<Order> orderList = new Vector<>();

        // Adding Input Data
        orderList.add(new Order(1, "Ram", 2500));
        orderList.add(new Order(2, "Sita", 4200));
        orderList.add(new Order(3, "Mohan", 3100));

        // Logic to find highest order amount
        double max = 0; 
        
        for (Order o : orderList) {
            if (o.getAmount() > max) {
                max = o.getAmount();
            }
        }

        // Output formatting
        System.out.println("Highest Order Amount = " + (int)max);
    }
}