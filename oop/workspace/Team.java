package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Team {
    private int idTeam;
    private String nameTeam;
    private List<User> idUser = new ArrayList<User>();
    private Date createdAt;
    private Date updatedAt;

    public Team(int idTeam, String nameTeam, List<User> idUser, Date createdAt, Date updatedAt) {
        this.idTeam = idTeam;
        this.nameTeam = nameTeam;
        this.idUser = idUser;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Team() {
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
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

