package service;

import model.Account;

public class BankService {

    public void openAccount(Account account) {
        System.out.println("Opening Account...");
        System.out.println(account.getAccountDetails());
    }

    public void applyInterest(Account account) {
        System.out.println("Applying Interest...");
        account.calculateInterest();
    }
}
