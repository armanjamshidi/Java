package session22.me;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Finder {

    private final Student student;

    public Finder() {
        this.student = new Student();
    }

    public void findStudentByFamilyName(String familyName, RandomAccessFile file) throws IOException {
        for (int i = 0; i < file.length() / 92; i++) {
            file.seek(i * 92L);
            student.readStudentFile(file);
            if (student.getFamily().equals(familyName)) {
                System.out.println(student);
            }
        }
    }

    public void findStudentByName(String Name, RandomAccessFile file) throws IOException {
        for (int i = 0; i < file.length() / 92; i++) {
            file.seek(i * 92L);
            student.readStudentFile(file);
            if (student.getName().equals(Name)) {
                System.out.println(student);
            }
        }
    }

}
