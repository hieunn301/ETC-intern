package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Department {
    private int id;
    private String name;
    private List<Team> teams = new ArrayList<>();
    private Date createdAt;
    private Date updatedAt;

    public Department(int id, String name, List<Team> teams, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.teams = teams;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Department() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
