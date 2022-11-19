package oop.workspace;

public class User {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String permission;

    public User(int id, String name, int age, String gender, String address, String permission) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.permission = permission;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id + '\n' +
                ", name='" + name + '\n' +
                ", age=" + age + '\n' +
                ", gender='" + gender + '\n' +
                ", address='" + address + '\n' +
                ", permission='" + permission +
                '}';
    }
}