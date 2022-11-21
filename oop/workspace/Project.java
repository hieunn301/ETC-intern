package oop.workspace;

public class Project {
    private int id;
    private String nameProject;
    private String descriptionProject;
    private int userId;

    public Project(int id, String nameProject, String descriptionProject, int userId) {
        this.id = id;
        this.nameProject = nameProject;
        this.descriptionProject = descriptionProject;
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

    public String getDescriptionProject() {
        return descriptionProject;
    }

    public void setDescriptionProject(String descriptionProject) {
        this.descriptionProject = descriptionProject;
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
                "id=" + id +
                ", nameProject='" + nameProject + '\'' +
                ", descriptionProject='" + descriptionProject + '\'' +
                ", userId=" + userId +
                '}';
    }
}
