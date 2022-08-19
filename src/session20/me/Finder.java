package session20.me;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finder {

    private Student student;

    public Finder() {
        this.student = new Student();
    }

    public void findStudent(Scanner input, String family) throws FileNotFoundException {
        while (input.hasNext())

            student.readStudentFromFile(input);
        if (student.getFamily().equals(family)) {
            System.out.println("family :" + family);
        }
    }

    public void findStudent(Scanner input, int id) throws FileNotFoundException {
        while (input.hasNext()) {
            student.readStudentFromFile(input);
            if (student.getStuNo() == id) {
                System.out.println("ID :" + id);
            }
        }

    }

    public void findStudent(Scanner input, double avg) throws FileNotFoundException {
        while (input.hasNext()) {
            student.readStudentFromFile(input);
            if (student.getAvg() == avg) {
                System.out.println("avg  " + student.getName() + student.getFamily() + " is :" + avg);
            }
        }
    }
}
