package session24.javaclass;

public class Teacher extends Person{
    private String teacherId;
    private String courseId;


    public Teacher(String name, String email, String teacherId , String courseId) {
        super(name, email);
        this.teacherId = teacherId ;
        this.courseId = courseId ;
    }
}
