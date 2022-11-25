package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private int idProject;
    private String nameProject;
    private String descriptionProject;
    private List<Team> teams = new ArrayList<>();
    private Date createdAt;
    private Date updatedAt;

}
