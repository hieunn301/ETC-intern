package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Team {
    private int idTeam;
    private String nameTeam;
    private String descriptionTeam;
    private List<User> idUser = new ArrayList<User>();
    private Date createdAt;
    private Date updatedAt;

    public Team(int idTeam, String nameTeam, String descriptionTeam, List<User> idUser, Date createdAt, Date updatedAt) {
        this.idTeam = idTeam;
        this.nameTeam = nameTeam;
        this.descriptionTeam = descriptionTeam;
        this.idUser = idUser;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public String getDescriptionTeam() {
        return descriptionTeam;
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

