package models;

import lombok.Getter;

@Getter
public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }
}
