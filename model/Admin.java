package model;

public class Admin extends User {

    public Admin(int id, String name) {
        super(id, name);
    }

    public void login() {
        System.out.println("Admin logged in");
    }

    public void logout() {
        System.out.println("Admin logged out");
    }
}
