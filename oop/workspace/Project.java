package oop.workspace;

import java.util.Calendar;
import java.util.Date;

public class Project {
    private String nameProject;
    private String timeStart;
    private String timeEnd;
    private String description;
    private String status;
    private String activity;

    public Project(String nameProject, String timeStart, String timeEnd, String description, String status, String activity) {
        this.nameProject = nameProject;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.description = description;
        this.status = status;
        this.activity = activity;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
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

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
