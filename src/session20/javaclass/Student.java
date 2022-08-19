package session20.javaclass;

import java.util.Formatter;
import java.util.Scanner;

public class Student {
    private String name;
    private String family;
    private int id;
    private double avgGrade;

    public Student() {
    }

    public Student(String name, String family, int id, double avgGrade) {
        this.name = name;
        this.family = family;
        this.id = id;
        this.avgGrade = avgGrade;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", id=" + id +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public void writeStudentInFile(Formatter output){
        output.format("%-10s %-10s %d %.2f%n",name,family,id,avgGrade);
    }


    public void readStudentFromFile(Scanner input){
        this.name = input.next();
        this.family = input.next();
        this.id = input.nextInt();
        this.avgGrade = input.nextDouble();
//        System.out.println(this.toString());
    }

}
