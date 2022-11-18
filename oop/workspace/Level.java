package oop.workspace;

public class Level extends User{
    private String level;

    public Level(String name, int age, String gender, String address, String level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
