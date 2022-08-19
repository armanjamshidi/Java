package session24.javaclass;

import java.util.Arrays;

public class Student extends Person {
    private final String studentId;
    private final double[] grades;


    public Student(String name, String email ,String studentId , double[] grades) {
        super(name, email);
        this.studentId = studentId ;
        this.grades = grades;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", studentId='" + studentId + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
