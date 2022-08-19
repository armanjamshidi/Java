package session30;

public class Student {
    private String name;
    private int stuID;

    public Student(String name, int stuID) {
        this.name = name;
        this.stuID = stuID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuID=" + stuID +
                '}';
    }
}
