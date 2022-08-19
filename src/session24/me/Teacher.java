package session24.me;

public class Teacher extends Human{
private int teacherID;
private int CourseID;
    public Teacher(String name, String email,int teacherID,int CourseID) {
        super(name, email);
        this.teacherID=teacherID;
        this.CourseID=CourseID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public int getCourseID() {
        return CourseID;
    }

    public void setCourseID(int courseID) {
        CourseID = courseID;
    }
}
