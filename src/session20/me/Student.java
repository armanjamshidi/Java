package session20.me;


import java.util.Formatter;
import java.util.Scanner;

public class Student {
    private String name;
    private String family;
    private int StuNo;
    private double avg;

    public Student() {
    }

    public Student(String name, String family, int stuNo, double avg) {
        this.name = name;
        this.family = family;
        StuNo = stuNo;
        this.avg = avg;
    }

    public void writeStudentinFile(Formatter output) {

        output.format("%s %s %d %f \n", name, family, StuNo, avg);

    }

    public void readStudentFromFile(Scanner input) {
        this.name = input.next();
        this.family = input.next();
        this.StuNo = input.nextInt();
        this.avg = input.nextDouble();
        //    System.out.printf("%s %s %d %d \n",input.next(),input.next(),input.nextInt(),input.nextInt());
//            System.out.println(input.next());
//            System.out.println(input.next());
//            System.out.println(input.nextInt());
//            System.out.println(input.nextInt());
        // System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getStuNo() {
        return StuNo;
    }

    public double getAvg() {
        return avg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setStuNo(int stuNo) {
        StuNo = stuNo;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", StuNo=" + StuNo +
                ", avg=" + avg +
                '}';
    }
}
