package exclass10.me;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class University {
    private RandomAccessFile file;
    private int student_size = 170;

    public University(String address) throws FileNotFoundException {
        file = new RandomAccessFile(address, "rw");
    }

    public void addStudents(Student st) throws IOException {
        file.seek(file.length());
        writeStudent(st.getName().trim(), st.getFamily().trim(), st.getStuNo().trim(), st.getGrades());
    }

    private void writeStudent(String name, String family, String stdNumber, double[] grades) throws IOException {
        file.writeChars(fixStringLength(name));
        file.writeChars(fixStringLength(family));
        file.writeChars(fixStringLength(stdNumber));
        writeGrades(grades);
    }

    private void writeGrades(double[] grades) throws IOException {
        for (int i = 0; i < grades.length; i++)
            file.writeDouble(grades[i]);
    }

    public String fixStringLength(String str) {

        if (str.length() >= 15) {
            return str.substring(0, 15);
        } else {
            int spaceNo = 15 - str.length();
            for (int i = 0; i < spaceNo; i++) {
                str += " ";
            }
            return str;
        }
    }

    public void printall() throws IOException {
        file.seek(0);
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - ");

        for (int i = 0; i < file.length() / student_size; i++) {
            Student student = readStudent();
            if (!student.getName().equals(""))
                System.out.println(student);
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
    }

    public Student readStudent() throws IOException {
        return new Student(readString(), readString(), readString(), readGrades());
    }

    public String readString() throws IOException {
        String str = "";
        for (int i = 0; i < 15; i++) {
            str += file.readChar();
        }
        return str.trim();
    }

    private double[] readGrades() throws IOException {
        double[] grades = new double[10];

        for (int i = 0; i < 10; i++) {
            grades[i] = file.readDouble();
        }

        return grades;
    }

    public Student findStudent(String stuNo) throws IOException {
        int index = findStdNo(stuNo);
        if (index == -1) {
            return null;
        }
        file.seek((long) index * student_size);
        return readStudent();
    }

    public int findStdNo(String stuNo) throws IOException {
        for (int i = 0; i < file.length() / student_size; i++) {
            file.seek((long) i * student_size);
            Student student = readStudent();
            if (student.getStuNo().equals(stuNo)) {
                return i;
            }
        }
        return -1;
    }

    public void removeStudent(String StuNo) throws IOException {
        file.seek((long) findStdNo(StuNo) * student_size);
        double[] grades = new double[10];
        writeStudent("", "", "", grades);
    }
}