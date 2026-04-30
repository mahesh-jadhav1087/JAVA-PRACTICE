/**
 * Problem: Bank Account Transaction System
 * 
 * Logic:
 * - Deposit: Add amount to balance if positive.
 * - Withdrawal: Deduct amount if balance is sufficient.
 * - Account Summary: Display current holder name and balance.
 * 
 * Approach:
 * - Use a 'BankAccount' class to encapsulate private data.
 * - Implement methods to perform safe transactions.
 * - Use conditional checks to prevent overdrafts.
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class BankAccount {
    private String holderName;
    private double balance;

    public BankAccount(String name, double initialDeposit) {
        this.holderName = name;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else {
            System.out.println("Error: Insufficient funds or invalid amount.");
        }
    }

    public void displaySummary() {
        System.out.println("\n--- Account Summary ---");
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Mahesh Jadhav", 1000.0);
        
        myAccount.deposit(500);
        myAccount.withdraw(200);
        myAccount.displaySummary();
    }
}