package session22.me;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {
    public static void main(String[] args) throws IOException {

        String filename = "Student.dat";
        RandomAccessFile file = new RandomAccessFile(filename, "rw");


        Student student = new Student("arman", "jamshidi", 2, 17.0);
        student.writeStudentFile(file);
        System.out.println(student);

        Student student1 = new Student("elliot", "alderson", 3, 17.2);
        student1.writeStudentFile(file);

        Finder finder = new Finder();
        finder.findStudentByName("elliot", file);
        finder.findStudentByFamilyName("alderson", file);

        file.close();
    }
}
