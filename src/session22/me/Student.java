package session22.me;

import java.io.IOException;
import java.io.RandomAccessFile;


public class Student {
    private String name;
    private String family;
    private int ID;
    private double avg;
    private final int size = 20;


    public Student(String name, String family, int ID, double avg) {
        this.name = name;
        this.family = family;
        this.ID = ID;
        this.avg = avg;
    }

    public Student() {
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

    public void writeStudentFile(RandomAccessFile file) throws IOException {
        file.writeChars(fixStringLength(name));
        file.writeChars(fixStringLength(family));
        file.writeInt(ID);
        file.writeDouble(avg);
    }

    public void readStudentFile(RandomAccessFile file) throws IOException {
        name = readString(file);
        family = readString(file);
        ID = file.readInt();
        avg = file.readDouble();
    }

    public String fixStringLength(String str) {
        if (str.length() >= size) {
            return str.substring(0, size);
        } else {
            int spaceNo = size - str.length();
            str += " ".repeat(spaceNo);
            return str;
        }
    }

    public String readString(RandomAccessFile file) throws IOException {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += file.readChar();
        }
        return str.trim();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", ID=" + ID +
                ", avg=" + avg +
                '}';
    }
}
    
