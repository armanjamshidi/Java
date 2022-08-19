package session20.javaclass;

import java.util.Scanner;

public class Finder {
    private Student student;

    public Finder() {
        this.student = new Student();
    }

    public void findStudent(String family, Scanner input) {
        while (input.hasNext()) {
            this.student.readStudentFromFile(input);
            if (student.getFamily().equals(family)) {
                System.out.println(student);
            }
        }
    }

    public void findStudent(int id, Scanner input) {
        while (input.hasNext()) {
            this.student.readStudentFromFile(input);
            if (student.getId() == id) {
                System.out.println(student);
            }
        }
    }

    public void findStudent(double avg, Scanner input) {
        while (input.hasNext()) {
            this.student.readStudentFromFile(input);
            if (student.getAvgGrade() >= avg) {
                System.out.println(student);
            }
        }
    }


}
