package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Board {
    private int idBoard;
    private String nameBoard;
    private String descriptionBoard;
    private List<User> idUser = new ArrayList<User>();
    private Date createdAt;
    private Date updatedAt;

    public Board(int idBoard, String nameBoard, String descriptionBoard, List<User> idUser, Date createdAt, Date updatedAt) {
        this.idBoard = idBoard;
        this.nameBoard = nameBoard;
        this.descriptionBoard = descriptionBoard;
        this.idUser = idUser;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getIdBoard() {
        return idBoard;
    }

    public String getNameBoard() {
        return nameBoard;
    }

    public String getDescriptionBoard() {
        return descriptionBoard;
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
