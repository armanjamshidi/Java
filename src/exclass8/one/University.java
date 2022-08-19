package exclass8.one;

import java.util.Scanner;

public class University {
    private int n;
    private int m;
    private Student[] students;

    public University(int n) {
        this.n = n;
        this.m = 0;
        students = new Student[n];
    }

    public void addStudent(Scanner input) {
        if (n == m + 1) {
            System.out.println("Class is full , cannot add anymore...");
            return;
        }

        System.out.println("Student " + (m + 1) + " : \n");

        System.out.println("First Name : ");
        String firstName = input.nextLine();

        System.out.println("Last Name : ");
        String lastName = input.nextLine();

        System.out.println("StdNumber : ");
        int stdNumber = Integer.parseInt(input.nextLine());

        System.out.println("Grades : ");
        String[] inputGrades = input.nextLine().split(" ");

        double[] grades = new double[inputGrades.length];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = Double.parseDouble(inputGrades[i]);
        }

        students[m++] = new Student(firstName, lastName, stdNumber, grades);
    }

    public double[] getGrades(int stdNo) {
        return students[findStdIndex(stdNo)].getGrades();
    }

    public void sortName() {
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (comparison(i, j))
                    swapStudent(students[i].getStdNumber(), students[j].getStdNumber());
            }
        }
    }

    public void swapStudent(int stdNo1, int stdNo2) {
        int stdOneIndex = findStdIndex(stdNo1);
        int stdTwoIndex = findStdIndex(stdNo2);

        if (stdOneIndex == -1 || stdTwoIndex == -1) {
            System.out.println("No Such Student...!");
            return;
        }

        Student temp = students[stdOneIndex];
        students[stdOneIndex] = students[stdTwoIndex];
        students[stdTwoIndex] = temp;
    }

    private int findStdIndex(int stdNo) {
        for (int i = 0; i < m; i++)
            if (students[i].getStdNumber() == stdNo)
                return i;
        return -1;
    }

    private boolean comparison(int first, int second) {
        String stdOneName = students[first].getLastName();
        String stdTwoName = students[second].getLastName();

        if (stdOneName.compareTo(stdTwoName) > 0)
            return true;
        return false;
    }

    public Student getStudent(int index) {
        return students[index];
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < m; i++)
            str += (students[i] + "\n");

        return str;
    }
}
