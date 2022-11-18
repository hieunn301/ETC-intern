package oop.workspace;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerUser {
    private List<User> users;

    public ManagerUser() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public List<User> searchUserByName(String name) {
        return this.users.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void showListInforUser() {
        this.users.forEach(o -> System.out.println(o.toString()));
    }
}