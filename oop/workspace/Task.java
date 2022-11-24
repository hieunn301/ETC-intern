package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
    private int idTask;
    private String nameTask;
    private String descriptionTask;
    private List<User> idUser = new ArrayList<User>();
    private Date createdAt;
    private Date updatedAt;

    public Task(int idTask, String nameTask, String descriptionTask, List<User> idUser, Date createdAt, Date updatedAt) {
        this.idTask = idTask;
        this.nameTask = nameTask;
        this.descriptionTask = descriptionTask;
        this.idUser = idUser;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getIdTask() {
        return idTask;
    }

    public String getNameTask() {
        return nameTask;
    }

    public String getDescriptionTask() {
        return descriptionTask;
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

