package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Team {
    private int idTeam;
    private String name;
    private List<User> users = new ArrayList<>();
    private Date createdAt;
    private Date updatedAt;

    public Team(int idTeam, String name, List<User> users, Date createdAt, Date updatedAt) {
        this.idTeam = idTeam;
        this.name = name;
        this.users = users;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Team() {
    }

    public int getIdTeam() {
        return idTeam;
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}

