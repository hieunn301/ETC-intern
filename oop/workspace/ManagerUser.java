package oop.workspace;

import java.util.ArrayList;
import java.util.List;

public class ManagerUser {
    private List<User> users;

    public ManagerUser() {
    }

    public void addUser(User user) {
        List<Integer> users = new ArrayList<>();

        users.add(1);
        users.add(2);
        users.add(3);
        users.add(4);
        users.add(5);
//        this.users.add((User) users);
        System.out.println(users);
    }

    public void editUser(int idUser) {
    }
    public void removeUser(int idUser) {
    }

    public List<User> viewUser(){
        return null;
    }

    public List<User> searchUser(String name) {
        return null;
    }

    public List<User> sortByName(String name){
        return null;
    }

    public List<User> sortByEmail(String email){
        return null;
    }
}