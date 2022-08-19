package session28.javaclass;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students;
//    private Student[] students2 ;

    public University(List<Student> students) {
//        this.students = new ArrayList<>();
        this.students = students;
    }


    public void addStudent(Student student){
        students.add(student);
    }

    public void editStudentInfo(int id, String name){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getId()==id){
                students.get(i).setName(name);
            }
        }
    }

    public void removeStudent(int id){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getId()==id){
                students.remove(i);
            }
        }
    }

    public void addStudentInPos(Student student , int pos){
        students.add(pos , student);
    }

    public void replaceStudentInPos(Student student , int pos){
        students.set(pos , student);
    }



    @Override
    public String toString() {
        return "University{" +
                "students=" + students +
                '}';
    }
}
