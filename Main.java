public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Nelson", 500000);
        BankAccount account2 = new BankAccount("Asagwara", 1000000);


        account1.checkBalance();
        account1.deposit(600000);
        account1.withdraw(200000);
        account1.withdraw(99999);


        account2.checkBalance();
        account2.deposit(500000);


        System.out.println("Account owner: " + account1.getOwnerName());
        System.out.println("Current balance: " + account1.getBalance());


        account1.setOwnerName("Nelson Asagwara");
        System.out.println("Updated account owner: " + account1.getOwnerName());  

        SavingsAccount savings = new SavingsAccount("Nelson", 100000, 5);
        savings.checkBalance();
        savings.applyInterest();


    }
}
