public class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String name, double initialBalance, double interestRate) {
        super(name, initialBalance);
        this.interestRate = interestRate;
    }

    void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest applied: " + interest + ". New balance: " + getBalance());
    }

    
}
