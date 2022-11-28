package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
    private int id;
    private String name;
    private String description;
    private List<User> users = new ArrayList<>();
    private String state;
    private Date createdAt;
    private Date updatedAt;

    public Task(int id, String name, String description, List<User> users, String state, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.users = users;
        this.state = state;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Task() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<User> getUsers() {
        return users;
    }

    public String getState() {
        return state;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

}

