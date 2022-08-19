package session28.me;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("arman", 99));
        students.add(new Student("reza", 231));


        University university = new University(students);

        university.addStudents(new Student("amir", 176));

        System.out.println(university);

        System.out.println("_".repeat(100));
        System.out.println();


        university.editStudent(176, "moein");

        System.out.println(university);
        System.out.println("_".repeat(100));


        university.removeStudent(231);

        System.out.println(university);
        System.out.println("_".repeat(100));


        university.replacestudent(new Student("ali",132));

        System.out.println(university);
        System.out.println("_".repeat(100));



        university.Shiftadd(new Student("hasan",1231));
        System.out.println(university);
    }

}
