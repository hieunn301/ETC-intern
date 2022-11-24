package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private int idProject;
    private String nameProject;
    private String descriptionProject;
    private List<User> idUser = new ArrayList<User>();
    private Date createdAt;
    private Date updatedAt;

    public Project(int idProject, String nameProject, String descriptionProject, List<User> idUser, Date createdAt, Date updatedAt) {
        this.idProject = idProject;
        this.nameProject = nameProject;
        this.descriptionProject = descriptionProject;
        this.idUser = idUser;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getIdProject() {
        return idProject;
    }

    public String getNameProject() {
        return nameProject;
    }

    public String getDescriptionProject() {
        return descriptionProject;
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
