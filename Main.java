import model.*;
import service.*;

public class Main {

    public static void main(String[] args) {

        Account sa = new SavingsAccount(101, "Dev", 20000, 5);
        Account ca = new CurrentAccount(102, "Dev", 500000, 50000);

        Customer customer = new Customer(1, "Dev Singh");
        customer.login();

        AccountService accountService = new AccountService();
        BankService bankService = new BankService();

        bankService.openAccount(sa);
        bankService.openAccount(ca);

        accountService.deposit(sa, 10000);
        accountService.withdraw(sa, 20000);

        bankService.applyInterest(sa);
        bankService.applyInterest(ca);

        System.out.println(sa.getAccountDetails());
        System.out.println(ca.getAccountDetails());

        customer.logout();
    }
}
