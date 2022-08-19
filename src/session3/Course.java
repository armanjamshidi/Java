package session3;

public class Course {
    private String courseName;

    public Course() {
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void printCourse() {
        System.out.println("Welcome to " + courseName);
    }
}