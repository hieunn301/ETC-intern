package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
    private int idTask;
    private String nameTask;
    private String descriptionTask;
    private List<User> users = new ArrayList<>();
    private String stateTask;
    private Date createdAt;
    private Date updatedAt;

}

