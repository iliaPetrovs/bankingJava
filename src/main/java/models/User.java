package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private String password;
    private Account account;

    public User(String name, String pass) {
        this.name = name;
        this.password = pass;
        this.account = new Account(0);
    }
}
