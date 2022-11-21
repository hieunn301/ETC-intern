package oop.workspace;

public class User {
    private int idUser;
    private String nameUser;
    private int age;
    private String gender;
    private String address;
    private String permission;

    public User(int idUser, String nameUser, int age, String gender, String address, String permission) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.permission = permission;
    }

    public User() {
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
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
                "idUser=" + idUser +
                ", nameUser='" + nameUser + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }
}