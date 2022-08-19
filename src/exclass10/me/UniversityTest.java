package exclass10.me;

import java.io.FileNotFoundException;
import java.io.IOException;

public class UniversityTest {
    public static void main(String[] args) throws IOException {
        String address = "C:\\temp\\uni.txt";
        University uni = new University(address);
        double[] g1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] g2 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        Student s1 = new Student("arman", "jamshidi", "9943493", g1);
        Student s2 = new Student("negin", "hajizadeh", "9925603", g2);
        uni.addStudents(s1);
        uni.addStudents(s2);
        uni.printall();
        System.out.println( uni.findStudent("9943493"));
        uni.removeStudent("9925603");
        uni.printall();

    }
}
