package session10;

import java.util.Arrays;

public class Student {
    private String studentName;
    private int stuNumber;
    private double grades[];

    public Student(String studentName, int stuNumber, double[] grades) {
        this.studentName = studentName;
        this.stuNumber = stuNumber;
        this.grades = grades;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }


    public double[] calculate(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];

        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        double average = sum / grades.length;
        double[] calculate = {min, max, average};
        return calculate;

    }
//public void print (double array[])
//{
//    for (int i=0 ;i<array.length;i++)
//    {
//        System.out.println(array[i]);
//    }
//}

    @Override
    public String toString() {
        double[] value = calculate(grades);
        return "Student{" +
                "studentname='" + studentName + '\'' +
                ", stunumber=" + stuNumber +
                ", grades=" + Arrays.toString(grades) +" | "+
                "min=" + value[0] + "  |  "+ "max=" + value[1] +"  |  "+ "average=" + value[2] +
                '}';
    }
//    @Override
//    public String toString(){
//        double[] gradeValues = calculateGrades();
//        return String.format("studentName: %s , studentId: %d , minGrade: %.1f , maxGrade: %.1f , avgGrade: %.1f" , studentName, studentId , gradeValues[0],gradeValues[1] , gradeValues[2]);
//    }
}












