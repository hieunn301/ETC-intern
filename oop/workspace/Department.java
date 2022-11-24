package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Department {
    private int idDepartment;
    private String nameDepartment;
    private String descriptionDepartment;
    private List<User> idUser = new ArrayList<User>();
    private Date createdAt;
    private Date updatedAt;

    public Department(int idDepartment, String nameDepartment, String descriptionDepartment, List<User> idUser, Date createdAt, Date updatedAt) {
        this.idDepartment = idDepartment;
        this.nameDepartment = nameDepartment;
        this.descriptionDepartment = descriptionDepartment;
        this.idUser = idUser;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public String getDescriptionDepartment() {
        return descriptionDepartment;
    }

    public List<User> getIdUser() {
        return idUser;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
