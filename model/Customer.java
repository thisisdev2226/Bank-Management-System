package model;

public class Customer extends User {

    public Customer(int id, String name) {
        super(id, name);
    }

    public void login() {
        System.out.println("Customer logged in");
    }

    public void logout() {
        System.out.println("Customer logged out");
    }
}
