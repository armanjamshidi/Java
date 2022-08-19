package session30;

import java.util.*;

public class University {
    private Map<String, List<Student>> map;

    public University(Map<String,List<Student>> map) {

        this.map = map;
    }

    public void addStudentCourse(String Coursname, Student student) {
         List<Student> stus=new LinkedList<>();
        if (map.containsKey(Coursname)) {
             map.get(Coursname).add(student);


        } else {

            stus.add(student);
            map.put(Coursname, stus);
        }

    }

    public void removeStudentCourse(String Coursname, Student student) {

        if (map.containsKey(Coursname)) {
            map.get(Coursname).remove(student);
        }
    }

    @Override
    public String toString() {
        return "University{" +
                "map=" + map +
                '}';
    }
}
