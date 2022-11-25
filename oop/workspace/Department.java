package oop.workspace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Department {
    private int idDepartment;
    private String nameDepartment;
    private List<Team> teams = new ArrayList<>();
    private Date createdAt;
    private Date updatedAt;
}
