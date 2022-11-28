package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private int idProject;
    private String name;
    private String description;
    private List<Team> teams = new ArrayList<>();
    private Date createdAt;
    private Date updatedAt;

    public Project(int idProject, String name, String description, List<Team> teams, Date createdAt, Date updatedAt) {
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.teams = teams;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Project() {
    }

    public int getIdProject() {
        return idProject;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
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
