import java.io.FileWriter;
import java.io.IOException;
public class BankAccount {
    private String ownerName;
    private double balance;

    BankAccount(String name, double initialBalance) {
        ownerName = name;
        balance = initialBalance;

    }
    public String getOwnerName() {
        return ownerName;
    }
    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println( amount + " deposited. New balance: " + balance);
        try {
            FileWriter logger = new FileWriter("transaction.txt", true);
            logger.write("DEPOSIT: " + amount + " | Balance: " + balance + "\n");
            logger.close();

        } catch (IOException e) {
            System.out.println("Log error: " + e.getMessage());
        }

    }
    void withdraw(double amount) {
        if ( amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println( amount + " withdrawn. New balance: " + balance);

        }
        try {
            FileWriter logger = new FileWriter("transaction.txt", true);
            logger.write("WITHDRAW: " + amount + " | Balance: " + balance + "\n");
            logger.close();

        } catch (IOException e) {
            System.out.println("Log error: " + e.getMessage());
        }

            
    }
    void checkBalance() {
        System.out.println("Current balance: " + balance);
        
    }

}
