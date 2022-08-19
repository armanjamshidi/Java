package session22.javaclass;


import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {

    public static void main(String[] args) throws IOException {

        //RandomAccessFile
        String path = "C:\\temp\\test.dat";
        RandomAccessFile file = new RandomAccessFile(path,"rw");
        System.out.println("pointer pos: " + file.getFilePointer());
        file.writeInt(123);//4 byte
        System.out.println("pointer pos: " + file.getFilePointer());
        file.writeChars("java programming");// each char = 2byte ===> 32 byte
        System.out.println("pointer pos: " + file.getFilePointer());
        file.writeDouble(20.87);// 8 byte
        System.out.println("pointer pos: " + file.getFilePointer());


        //read
        file.seek(0);
        System.out.println(file.readInt());
        file.close();

        // 1258 18.5 ali......... amini........
        // 258  15.8 alireza..... mohamdkarimiy

        String studentPath = "C:\\temp\\students.dat";
        RandomAccessFile studentFile = new RandomAccessFile(studentPath,"rw");
        Student student1 = new Student(123,"ali","amini",18.78);
        Student student2 = new Student(258,"reza","askarizade",15.8);
        student1.writeStudentInFile(studentFile);
        student2.writeStudentInFile(studentFile);

//        read
        Student student = new Student();
        studentFile.seek(0);
        student.readStudentFromFile(studentFile);
        System.out.println(student);

        Finder finder = new Finder();
        finder.findStudent(studentFile,"askarizade");
        finder.findStudent(studentFile,123);





    }
}
