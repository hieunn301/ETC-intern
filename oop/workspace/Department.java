package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Department {
    private int idDepartment;
    private String nameDepartment;
    private List<User> idUser = new ArrayList<User>();
    private Date createdAt;
    private Date updatedAt;

    public Department(int idDepartment, String nameDepartment, List<User> idUser, Date createdAt, Date updatedAt) {
        this.idDepartment = idDepartment;
        this.nameDepartment = nameDepartment;
        this.idUser = idUser;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Department() {
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public List<User> getIdUser() {
        return idUser;
    }

    public void setIdUser(List<User> idUser) {
        this.idUser = idUser;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
