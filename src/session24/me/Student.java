package session24.me;

import java.util.Arrays;

public class Student extends Human {
    private int StuNo;
    private double[] grades;

    public Student(String name, String email, int StuNo, double[] grades) {
        super(name, email);
        this.StuNo = StuNo;
        this.grades = grades;
    }

    public int getStuNo() {
        return StuNo;
    }

    public void setStuNo(int stuNo) {
        StuNo = stuNo;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public void changeEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", StuNo=" + StuNo +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
