package exclass10.me;

import java.util.Arrays;

public class Student {
    private String name;//30
    private String family;//30
    private String StuNo;//4
    private double []grades;//80

    public Student(String name, String family, String stuNo, double[] grades) {
        this.name = name;
        this.family = family;
        StuNo = stuNo;
        this.grades = grades;
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

    public String getStuNo() {
        return StuNo;
    }

    public void setStuNo(String stuNo) {
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

