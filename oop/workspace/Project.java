package oop.workspace;

import javax.swing.*;
import java.util.Calendar;
import java.util.Date;

public class Project {
    private int id;
    private String nameProject;
    private Date timeStart;
    private Date timeEnd;
    private String description;
    private String status;
    private String activity;
    private int userId;

    public Project(int id, String nameProject, Date timeStart, Date timeEnd, String description, String status, String activity, int userId) {
        this.id = id;
        this.nameProject = nameProject;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.description = description;
        this.status = status;
        this.activity = activity;
        this.userId = userId;
    }

    public Project() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActivity() { return activity; }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Project{" +
                " id= " + id + '\n' +
                " nameProject= " + nameProject + '\n' +
                " timeStart= " + timeStart + '\n' +
                " timeEnd= " + timeEnd + '\n' +
                " description= " + description + '\n' +
                " status= " + status + '\n' +
                " activity= " + activity + '\n' +
                " userId= " + userId +
                " }";
    }
}
