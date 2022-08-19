package exclass10.javaclass;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class University {
    private RandomAccessFile file;

    private final int STRING_LENGTH = 15;
    private final int STUDENT_LENGTH = 170;
    private final int PLACE_OF_STD_NUMBER = 60;

    public University(String address) throws FileNotFoundException {
        this.file = new RandomAccessFile(address, "rw");
    }

    public void addStudent(Student student) throws IOException {
        file.seek(file.length());
        System.out.println("str :" + student.getName().length());
        System.out.println("STU NAME:" + student.getName());
        System.out.println("Stu name trim : " + student.getName().trim());
        System.out.println(" trim :" + student.getName().trim().length());
        writeStudent(student.getName().trim(), student.getFamily().trim(), student.getStdNumber().trim(), student.getGrades());


    }

    public Student findStudent(String stdNumber) throws IOException {
        int index = findStudentIndex(stdNumber);
        if (index > file.length())
            return null;
        file.seek(index - PLACE_OF_STD_NUMBER);
        return returnStudent();
    }
    private int findStudentIndex(String stdNumber) throws IOException {
        int index;

        for (index = PLACE_OF_STD_NUMBER; index < file.length(); index += STUDENT_LENGTH) {
            file.seek(index);
            String findStd = readString();
            if (findStd.equals(stdNumber))
                break;
        }
        return index;
    }

    public void removeStudent(String stdNumber) throws IOException {
        file.seek(findStudentIndex(stdNumber) - PLACE_OF_STD_NUMBER);
        fillWithBlank();
    }

    public void printAllStudent() throws IOException {
        file.seek(0);

        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - ");

        for (int i = 0; i < file.length() / STUDENT_LENGTH; i++) {
            Student student = returnStudent();
            if (checkNullStudent(student))
                System.out.println(student);
        }

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
    }

    private void writeStudent(String name, String family, String stdNumber, double[] grades) throws IOException {
        file.writeChars(fixeLen(name));
        file.writeChars(fixeLen(family));
        file.writeChars(fixeLen(stdNumber));
        setGrades(grades);
    }

    private void setGrades(double[] grades) throws IOException {
        for (int i = 0; i < grades.length; i++)
            file.writeDouble(grades[i]);
    }



    private String readString() throws IOException {
        String str = "";

        for (int i = 0; i < STRING_LENGTH; i++)
            str += file.readChar();

        return str.trim();
    }

    private void fillWithBlank() throws IOException {
        double[] grades = new double[10];
        writeStudent("", "", "", grades);
    }

    private Student returnStudent() throws IOException {
        return new Student(readString(), readString(), readString(), readGrades());
    }

    private double[] readGrades() throws IOException {
        double[] grades = new double[10];

        for (int i = 0; i < 10; i++)
            grades[i] = file.readDouble();

        return grades;
    }

    private boolean checkNullStudent(Student student) {
        return !student.getName().equals("");
    }

    private String fixeLen(String str) {
        String newStr = str;

        for (int i = 0; i < STRING_LENGTH - str.length(); i++)
            newStr += " ";


        return newStr;
    }

    public void closeFile() throws IOException {
        file.close();
    }
}
