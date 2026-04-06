package model;

public abstract class User {

    protected int userId;
    protected String userName;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public abstract void login();
    public abstract void logout();
}

