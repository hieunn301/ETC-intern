package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Board {
    private int idList;
    private String nameList;
    private String descriptionBoard;
    private List<User> idUser = new ArrayList<User>();
    private Date createdAt;
    private Date updatedAt;

    public Board(int idList, String nameList, String description, List<User> idUser, Date createdAt, Date updatedAt) {
        this.idList = idList;
        this.nameList = nameList;
        this.descriptionBoard = description;
        this.idUser = idUser;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Board() {
    }

    public int getIdList() {
        return idList;
    }

    public void setIdList(int idList) {
        this.idList = idList;
    }

    public String getNameList() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList = nameList;
    }

    public String getDescription() {
        return descriptionBoard;
    }

    public void setDescription(String description) {
        this.descriptionBoard = description;
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
