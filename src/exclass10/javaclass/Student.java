package exclass10.javaclass;

import java.util.Arrays;

public class Student {
    private String name;
    private String family;
    private String stdNumber;
    private double[] grades;

    public Student(String name, String family, String stdNumber, double[] grades) {
        this.name = name;
        this.family = family;
        this.stdNumber = stdNumber;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getStdNumber() {
        return stdNumber;
    }

    public double[] getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return String.format("Name : " + this.name + " , Family : " + this.family + " , Student Number : " + this.stdNumber + " , Grades : " + Arrays.toString(this.grades));
    }
}
