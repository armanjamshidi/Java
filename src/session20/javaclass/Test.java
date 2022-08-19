package session20.javaclass;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "students.txt";

        //write
        Formatter output = new Formatter(path);
/*        output.format("%s %d","java" , 123);

        //close
        output.close();

        //read
        Scanner input = new Scanner(new File(path));
        System.out.println(input.next());
        System.out.println(input.nextInt());*/


        Student student1 = new Student("aliReza", "amini", 123, 18.5);
        Student student2 = new Student("mina", "mohamadi", 258, 16.5);
        student1.writeStudentInFile(output);
        student2.writeStudentInFile(output);
        output.close();

//        Student student2 = new Student();
//        student2.readStudentFromFile(new Scanner(new File(path)));
//        System.out.println(student2.toString());

        Finder finder = new Finder();
        finder.findStudent("amini", new Scanner(new File(path)));// find student with this family
        finder.findStudent(123, new Scanner(new File(path)));// find student with this id
        finder.findStudent(15.5, new Scanner(new File(path)));// find student with avg>15.5


    }
}
