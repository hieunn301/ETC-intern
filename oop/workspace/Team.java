package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Team {
    private int idTeam;
    private String nameTeam;
    private List<User> users = new ArrayList<>();
    private Date createdAt;
    private Date updatedAt;
}

