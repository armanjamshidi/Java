package exclass8.one;

import java.util.Scanner;

public class UniversityTest {
    public static void main(String[] args) {
        University university = new University(5);
        Scanner input = new Scanner(System.in);

        university.addStudent(input);
        university.addStudent(input);
        university.addStudent(input);
        university.addStudent(input);

        System.out.println("All Students : ");
        System.out.println(university);

        System.out.println("Swap Student 1 & 3 : ");
        university.swapStudent(university.getStudent(0).getStdNumber(), university.getStudent(2).getStdNumber());
        System.out.println(university);

        System.out.println("Grades Of Student 4 : ");
        double[] grads = university.getGrades(university.getStudent(3).getStdNumber());
        for (double d : grads)
            System.out.print(d + " ");

        System.out.println("\nBefore Sort : ");
        System.out.println(university);

        university.sortName();

        System.out.println("After Sort : ");
        System.out.println(university);
    }
}
