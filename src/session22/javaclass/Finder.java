package session22.javaclass;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Finder {
    private Student student;

    public Finder(){
        this.student=new Student();
    }

    public void findStudent(RandomAccessFile file , String family) throws IOException {
        for (int i = 0; i < file.length()/92; i++) {
            file.seek(i*92);
           student.readStudentFromFile(file);
            if(student.getFamily().equals(family)){
                System.out.println(student);
            }
        }

    }

    public void findStudent(RandomAccessFile file , int id) throws IOException {
        for (int i = 0; i < file.length()/92; i++) {
            file.seek(i*92);
            student.readStudentFromFile(file);
            if(student.getId()==id){
                System.out.println(student);
            }
        }
    }



}
