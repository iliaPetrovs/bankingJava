package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private String password;

    public User(String name, String pass) {
        this.name = name;
        this.password = pass;
    }
}
