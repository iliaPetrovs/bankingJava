package models;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public List<User> users;

    public Users() {
        users = new ArrayList<>();
    }

    public void add(User user) {
        users.add(user);
    }

    public void remove(User user) {
        users.remove(user);
    }

    public List<User> getAll() {
        return users;
    }

    public boolean doesContain(User user) {
        return users.contains(user);
    }

    public void deleteAll() {
        users.removeAll(users);
    }
}
