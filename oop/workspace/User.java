package oop.workspace;

import java.util.List;
import java.util.Stack;
public class User {
    private int id;
    private String nameUser;
    private String email;
    private String password;
    private String dateOfBirth;
    private String address;
    private String permission;
    private Boolean isAvailable;
    private String createdAt;
    private String updatedAt;
    private int idTeam;

    public User(int id, String nameUser, String email, String password, String dateOfBirth, String address, String permission, Boolean isAvailable, String createdAt, String updatedAt, int idTeam) {
        this.id = id;
        this.nameUser = nameUser;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.permission = permission;
        this.isAvailable = isAvailable;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.idTeam = idTeam;
    }

    public User() {
    }

    public static void addUser(User user) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    private List<User> users;
    public void add(User user) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        System.out.println("add User " + stack);
        this.users.add(user);
    }
    public void edit(int id){
    }
    public List<User> view(){
        return null;
    }
    public void remove(int id) {
        Stack<Integer> user = new Stack<>();

        user.push(1);
        user.push(2);
        user.push(3);
        user.push(4);
        user.push(5);
        System.out.println("remove " + user.pop()); // 5
        System.out.println("remove " + user.pop()); // 4
        System.out.println("list user: " + user); // [1, 2, 3]
        user.clear();
        System.out.println("list user " + user); // []
    }
    public void search(Stack<Integer> user, int element) {
        Integer pos = user.search(element);
        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nameUser='" + nameUser + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", permission='" + permission + '\'' +
                ", isAvailable=" + isAvailable +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", idTeam=" + idTeam +
                ", users=" + users +
                '}';
    }
}
