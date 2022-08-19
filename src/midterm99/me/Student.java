package midterm99.me;

import java.util.Arrays;

public class Student {
    private String name;
    private String family;
    private String StuNum;
    private int []grades;
    private double avg;

    public Student(String name, String family, String stuNum, int[] grades) {
        this.name = name;
        this.family = family;
        StuNum = stuNum;
        this.grades = grades;
        this.avg=average();
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

    public String getStuNum() {
        return StuNum;
    }

    public void setStuNum(String stuNum) {
        StuNum = stuNum;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }


    public double  average() {
        double sum = 0;
        for (int j : grades) {
            sum += j;

        }
        return sum/ grades.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", StuNum='" + StuNum + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
