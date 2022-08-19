package exclass10.javaclass;

import java.io.FileNotFoundException;
import java.io.IOException;

public class UniversityTest {
    public static void main(String[] args) throws IOException {
        String address = "E:\\javaclass\\src\\exclass10\\uni.txt";
        University uni = new University(address);

        double[] g1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] g2 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        double[] g3 = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        double[] g4 = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        Student s1 = new Student("       Moein        ", "shishebor", "9834443", g1);
        Student s2 = new Student("Ali", "Zare", "9734543", g2);
      //  Student s3 = new Student("Reza", "Shams", "9644443", g3);
     //   Student s4 = new Student("Negin", "Honary", "9943034", g4);

        // add Student
        uni.addStudent(s1);
        uni.addStudent(s2);
      //  uni.addStudent(s3);
     //   uni.addStudent(s4);

        // All Student
        System.out.print("All ");
        uni.printAllStudent();
        System.out.println(s1);

        // find Student
//        System.out.println("find 1 ");
//        System.out.println(uni.findStudent("9834443"));
//
//        System.out.println("find 4 ");
//        System.out.println(uni.findStudent("9943034"));
//
//        System.out.println("find null Student ");
//        System.out.println(uni.findStudent("9912345"));
//
//        // remove Student
//        System.out.print("All ");
//        uni.printAllStudent();
//
        uni.removeStudent("9834443");
//        System.out.println(" - - - - - remove 1- - - - -");
        uni.printAllStudent();
//
//        uni.removeStudent("9644443");
//        System.out.println(" - - - - - remove 3- - - - -");
//        uni.printAllStudent();

        // closing file
        uni.closeFile();

    }
}
