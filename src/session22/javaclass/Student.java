package session22.javaclass;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Student {
    private int id;
    private String name;
    private String family;
    private double avg;
    private final int size = 20;


    public Student() {
    }

    public Student(int id, String name, String family, double avg) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.avg = avg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }



    public void writeStudentInFile(RandomAccessFile file) throws IOException {
        file.writeInt(id);
        file.writeChars(fixLen(name));
        file.writeChars(fixLen(family));
        file.writeDouble(avg);
    }

    private String fixLen(String name) {
        String str= name;
        if(name.length()<size){
            for (int i = 0; i < size-name.length(); i++) {
                str+=" ";
            }
            return str;
        }else {
            return name.substring(0,size);
        }
    }

    public void readStudentFromFile(RandomAccessFile file ) throws IOException {
        this.id = file.readInt();
        this.name = readFix(file);
        this.family = readFix(file);
        this.avg = file.readDouble();
    }

    private String readFix(RandomAccessFile file) throws IOException {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += file.readChar();
        }
        return str.trim();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", avg=" + avg +
                '}';
    }

}
