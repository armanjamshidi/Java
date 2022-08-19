package midterm1_1400.me;

import java.util.Arrays;

public class Student {
    private String name;
    private String family;
    private int StuNo;
    private double [] grades;


    public Student(String name, String family, int stuNo, double[] grades) {
        this.name = name;
        this.family = family;
        StuNo = stuNo;
        this.grades = grades;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", StuNo=" + StuNo +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
