package midterm1_1400.me;

import java.util.Arrays;
import java.util.Scanner;

public class University {
    private int m;
    private int n;
    private final Student[] studentlist;

    public University(int n) {
        this.n = n;
        m = 0;
        studentlist = new Student[n];
    }

    public void addStudent(Scanner in) {
        Student stu = new Student();
        if (m != n) {
            System.out.print("first Name: ");
            stu.setName(in.next());
            System.out.print("Family name: ");
            stu.setFamily(in.next());
            System.out.print("Student Number: ");
            stu.setStuNo(in.nextInt());
            System.out.print("Grades(5):");
            double[] grades = new double[5];
            for (int i = 0; i < 5; i++)
                grades[i] = in.nextDouble();
            stu.setGrades(grades);
            studentlist[m] = stu;
            m++;
        } else {
            System.out.println("full!");
        }

    }

    public int findStudent(int stdNo) {

        for (int i = 0; i < studentlist.length; i++) {
            if (studentlist[i].getStuNo() == stdNo)

                return i;
        }
        return -1;

    }

    public void SwapStudent(int stu1, int stu2) {
        int s1 = findStudent(stu1);
        int s2 = findStudent(stu2);
        Student temp = studentlist[s1];
        studentlist[s1] = studentlist[s2];
        studentlist[s2] = temp;
    }

    public double[] getGrades(int stdNo) {
        return studentlist[findStudent(stdNo)].getGrades();
    }

    public void sort() {
        String str = "";
        String[] name = new String[m];
        for (int i = 0; i < m; i++) {
            name[i] = studentlist[i].getFamily();
        }

        for (int j = 0; j < name.length - 1; j++) {
            for (int c = j + 1; c < name.length; c++) {
                if (name[j].compareTo(name[c]) > 0) {
                    String temp = name[j];
                    name[j] = name[c];
                    name[c] = temp;
                }
            }
        }
        for (int i = 0; i < name.length; i++) {
            str += name[i];
        }
        System.out.println(str);

    }

    @Override
    public String toString() {
        return "University{" +
                "studentlist=" + Arrays.toString(studentlist) +
                '}';
    }
}

