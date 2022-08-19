package session28.me;

import java.util.ArrayList;
import java.util.List;


public class University {

   private List<Student> students;

    public University(List<Student> students) {
//        this.students = new ArrayList<>();
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public void editStudent(int id, String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == id) {
                students.get(i).setName(name);
            }
        }
    }
    public void removeStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == id) {
//               students.remove(i);
               students.remove(students.get(i));
            }
        }
    }
    public void replacestudent(Student student)
    {
        students.set(0,student);
    }
    public void Shiftadd(Student student)
    {
        students.add(0,student);
    }
    @Override
    public String toString() {
        return "University{" +
                "students=" + students +
                '}';
    }
}
