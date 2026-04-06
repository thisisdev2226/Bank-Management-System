package model;

public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolderName,
                          double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for Current Account");
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }

        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn from Current Account: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}