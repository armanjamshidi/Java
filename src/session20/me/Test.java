package session20.me;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Test {
    static public void main(String[] args) throws FileNotFoundException {
        Student student = new Student("arman", "jamshidi", 9943493, 17);

        String filename = "C:\\temp\\a.txt";
        Formatter output = new Formatter(filename);
        student.writeStudentinFile(output);
        output.close();
        Scanner input = new Scanner(new File(filename));
        Finder finder = new Finder();
        finder.findStudent(new Scanner(new File(filename)), "jamshidi");
        finder.findStudent(new Scanner(new File(filename)), 9943493);
        //----------------------------------------------------------------------------------
        //-------------------------------------------------------------------------
        Student student1 = new Student("arash", "jamshidi", 9943492, 18);

        Formatter out = new Formatter(filename);
        student1.writeStudentinFile(out);
        out.close();
        finder.findStudent(new Scanner(new File(filename)), "jamshidi");
        finder.findStudent(new Scanner(new File(filename)), 18.0);
    }
}
