package model;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolderName,
                          double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);

        if (balance < 1000) {
            throw new IllegalArgumentException("Minimum balance must be 1000");
        }

        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}